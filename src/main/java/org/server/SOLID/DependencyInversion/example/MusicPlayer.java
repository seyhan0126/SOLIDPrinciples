package org.server.SOLID.DependencyInversion.example;

public class MusicPlayer {
    private final MusicLoader loader;


    public MusicPlayer(MusicLoader loader) {
        this.loader = loader;
    }

    public void play(){
        loader.load();
    }
}
