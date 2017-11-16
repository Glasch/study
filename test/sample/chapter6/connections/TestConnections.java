package sample.chapter6.connections;

import junit.framework.TestCase;
import sample.chapter6.Connection;
import sample.chapter6.ConnectionManager;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class TestConnections extends TestCase {
    public void testGetConnection() {
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        assertNotNull(connectionManager.getConnection());
    }

    public void testConnectionsCount() {
        ConnectionManager.setPoolSize(2);
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection conn1 = connectionManager.getConnection();
        conn1.start();

        Connection conn2 = connectionManager.getConnection();
        conn2.start();

        boolean fail = false;
        try {
            connectionManager.getConnection();
        } catch (Exception e) {
            fail = true;
        }
        assertTrue(fail);
    }

    public void testFreeConnection(){
        ConnectionManager.setPoolSize(2);
        ConnectionManager connectionManager = ConnectionManager.getInstance();
        Connection conn1 = connectionManager.getConnection();
        conn1.start();

        Connection conn2 = connectionManager.getConnection();
        conn2.start();

        conn1.end();

        connectionManager.getConnection();

    }
}
