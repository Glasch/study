package sample.chapter6;

/**
 * Copyright (c) Anton on 10.08.2017.
 */
public class ConnectionManager {
    private static ConnectionManager instance;
    public static final int DEFAULT_POOL_SIZE = 10;
    public static int poolSize = DEFAULT_POOL_SIZE;

    private final Connection[] connections;

    private ConnectionManager(int poolSize) {
        connections = new Connection[poolSize];
    }

    public static ConnectionManager getInstance(){
        if(instance == null){
            instance = new ConnectionManager(poolSize);
        }
        return instance;
    }

     public Connection getConnection() {
        for (Connection connection : connections) {
            if (connection != null && !connection.isUsed())
                return connection;
        }

        for (int i = 0; i < connections.length; i++) {
            Connection connection = connections[i];
            if (connection == null) {
                connections[i] = new Connection();
                return connections[i];
            }
        }
        throw new IllegalStateException("No connections in pool");
    }

    public static int getPoolSize() {
        return poolSize;
    }

    public static void setPoolSize(int poolSize) {
        ConnectionManager.poolSize = poolSize;
    }


}
