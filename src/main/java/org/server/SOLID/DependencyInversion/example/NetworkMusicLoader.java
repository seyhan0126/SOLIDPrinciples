package org.server.SOLID.DependencyInversion.example;

public class NetworkMusicLoader implements MusicLoader{
    @Override
    public void load() {
        System.out.println("Loading music from network...");
    }
}
