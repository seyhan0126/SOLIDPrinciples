package org.server.SOLID.DependencyInversion;

// this is another low level module
public class OracleDatabase {
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }
}
