package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaDriver;

public class Mp4AudioPlayer extends AudioPlayer {
    public Mp4AudioPlayer(MediaDriver mediaDriverImpl) {
        super(mediaDriverImpl);
    }

    public void play(String fileName) {
        System.out.println("Using Mp4AudioPlayer:");
        mediaDriverImpl.playMedia(fileName);
    }
}