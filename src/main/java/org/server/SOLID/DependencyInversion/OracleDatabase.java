package org.server.SOLID.DependencyInversion;

// this is another low level module
public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }
}
