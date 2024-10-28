package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaDriver;

public class VlcAudioPlayer extends AudioPlayer {
    public VlcAudioPlayer(MediaDriver mediaDriverImpl) {
        super(mediaDriverImpl);
    }

    public void play(String fileName) {
        System.out.println("Using VlcAudioPlayer:");
        mediaDriverImpl.playMedia(fileName);
    }
}