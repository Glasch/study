package sample.httpclient;

import junit.framework.TestCase;
import sample.myHttpClient.MyHttpClient;

/**
 * Copyright (c) Anton on 26.12.2017.
 */
public class TestMyHttpClient extends TestCase {

    public void testMyHttpClient(){
        MyHttpClient myHttpClient = new  MyHttpClient();
        myHttpClient.run("Samara");
    }

}
