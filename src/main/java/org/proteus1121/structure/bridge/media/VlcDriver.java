package org.proteus1121.structure.bridge.media;

public class VlcDriver implements MediaDriver {
    public void playMedia(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}