package org.server.SOLID.DependencyInversion;
//low level module
public class MySQLDatabase {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }
}
