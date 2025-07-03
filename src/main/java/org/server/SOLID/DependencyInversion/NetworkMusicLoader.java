package org.server.SOLID.DependencyInversion;

public class NetworkMusicLoader implements MusicLoader{
    @Override
    public void load() {
        System.out.println("Loading music from network...");
    }
}
