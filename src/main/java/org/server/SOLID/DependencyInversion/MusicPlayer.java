package org.server.SOLID.DependencyInversion;

public class MusicPlayer {
    private final MusicLoader loader;


    public MusicPlayer(MusicLoader loader) {
        this.loader = loader;
    }

    public void play(){
        loader.load();
    }
}
