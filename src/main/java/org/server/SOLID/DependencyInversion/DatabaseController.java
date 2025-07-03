package org.server.SOLID.DependencyInversion;
// the high level module
public class DatabaseController {
    private final OracleDatabase database;

    public DatabaseController() {
        // tight binding when we program to a class (instead of an interface)
        database = new OracleDatabase();
        database.connect();
        database.disconnect();
    }
}
