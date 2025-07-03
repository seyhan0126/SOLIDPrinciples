package org.server.SOLID.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        MusicLoader loader = new NetworkMusicLoader();
        MusicPlayer player = new MusicPlayer(loader);

        player.play();
    }
}
