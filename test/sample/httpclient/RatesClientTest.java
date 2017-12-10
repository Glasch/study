package sample.httpclient;

import junit.framework.TestCase;

import java.io.IOException;

/*
 * Copyright (c) 2016 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: glaschenko
 * Created: 10.12.2017
 */
public class RatesClientTest extends TestCase {

    public void testUSDRates() {
        ExchangeRatesLoader loader = new ExchangeRatesLoader();
        try {
            loader.updateRates();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("USD RUB rate: " + loader.getRate("RUB"));
    }
}
