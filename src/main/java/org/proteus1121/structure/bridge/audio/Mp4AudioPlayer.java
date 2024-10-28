package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaPlayer;

public class Mp4AudioPlayer extends AudioPlayer {
    public Mp4AudioPlayer(MediaPlayer mediaPlayerImpl) {
        super(mediaPlayerImpl);
    }

    public void play(String fileName) {
        System.out.println("Using Mp4AudioPlayer:");
        mediaPlayerImpl.playMedia(fileName);
    }
}