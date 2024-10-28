package org.proteus1121.structure.bridge.media;

public class Mp3Driver implements MediaDriver {
    public void playMedia(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}