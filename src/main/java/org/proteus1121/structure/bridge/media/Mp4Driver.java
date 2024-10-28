package org.proteus1121.structure.bridge.media;

public class Mp4Driver implements MediaDriver {
    public void playMedia(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
