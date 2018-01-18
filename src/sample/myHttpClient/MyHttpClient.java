package sample.myHttpClient;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Copyright (c) Anton on 26.12.2017.
 */
public class MyHttpClient {

    private int i=0 ;
    private int j ;
    HttpURLConnection connection = null;

  public void run(String city) {

        String path = "https://api.openweathermap.org/data/2.5/weather?q="
                + city +
                "&units=metric&APPID=aab8129a4b312546df5d348310ea8efc";


        StringBuilder res = new StringBuilder();

        try {
            connection = (HttpURLConnection) new URL(path).openConnection();


            connection.connect();


            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));


                String line;
                while ((line = in.readLine()) != null) {
                    res.append(line);
                }
                JSONObject jsonObj = new JSONObject(res.toString());
                int temp = ((JSONObject) jsonObj.get("main")).getInt("temp");
                System.out.println("Temperature in " + city + " = " +  temp);

            }

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }


    }
}