package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaDriver;

public class Mp3AudioPlayer extends AudioPlayer {
    public Mp3AudioPlayer(MediaDriver mediaDriverImpl) {
        super(mediaDriverImpl);
    }

    public void play(String fileName) {
        System.out.println("Using Mp3AudioPlayer:");
        mediaDriverImpl.playMedia(fileName);
    }
}