package org.proteus1121.structure.bridge.media;

public class VlcPlayer implements MediaPlayer {
    public void playMedia(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}