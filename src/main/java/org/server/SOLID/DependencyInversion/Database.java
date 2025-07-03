package org.server.SOLID.DependencyInversion;

public interface Database {
    void connect();
    void disconnect();
}
