package sample.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.HashMap;

/*
 * Copyright (c) 2016 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: glaschenko
 * Created: 10.12.2017
 */
public class ExchangeRatesLoader {
    private HashMap<String, Double> usdRates = new HashMap<>();

    public void updateRates() throws IOException{
        HttpClientBuilder builder = HttpClientBuilder.create();
        HttpClient client = builder.build();
        HttpGet request = null;
        try {
            URIBuilder uriBuilder = new URIBuilder("https://api.fixer.io/latest");
            uriBuilder.addParameter("base", "USD");
            request = new HttpGet(uriBuilder.build());
        } catch (URISyntaxException e) {
            throw new IllegalStateException(e);
        }
        HttpResponse response = client.execute(request);
        StringBuilder sb = readResponse(response);

        JSONObject obj = new JSONObject(sb.toString());
        final JSONObject ratesObj = obj.getJSONObject("rates");
        ratesObj.keySet().forEach(e -> {
            usdRates.put(e.toString(), ratesObj.getDouble(e.toString()));
        });
    }

    private StringBuilder readResponse(HttpResponse response) throws IOException {
        InputStreamReader in = new InputStreamReader(response.getEntity().getContent());
        BufferedReader rd = new BufferedReader(in);
        StringBuilder sb = new StringBuilder();
        String s = rd.readLine();
        while (s != null){
            sb.append(s);
            s = rd.readLine();
        }
        return sb;
    }

    public double getRate(String currencyCode) {
        return usdRates.get(currencyCode);
    }
}
