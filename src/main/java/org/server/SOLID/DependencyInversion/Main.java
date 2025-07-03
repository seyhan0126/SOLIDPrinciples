package org.server.SOLID.DependencyInversion;

public class Main {
    // now the high level module is depending on low level module. "Both should depend on abstractions"
    public static void main(String[] args) {
        new DatabaseController();
    }
}