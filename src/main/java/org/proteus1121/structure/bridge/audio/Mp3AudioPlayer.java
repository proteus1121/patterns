package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaPlayer;

public class Mp3AudioPlayer extends AudioPlayer {
    public Mp3AudioPlayer(MediaPlayer mediaPlayerImpl) {
        super(mediaPlayerImpl);
    }

    public void play(String fileName) {
        System.out.println("Using Mp3AudioPlayer:");
        mediaPlayerImpl.playMedia(fileName);
    }
}