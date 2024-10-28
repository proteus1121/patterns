package org.proteus1121.structure.bridge.audio;

import org.proteus1121.structure.bridge.media.MediaPlayer;

public class VlcAudioPlayer extends AudioPlayer {
    public VlcAudioPlayer(MediaPlayer mediaPlayerImpl) {
        super(mediaPlayerImpl);
    }

    public void play(String fileName) {
        System.out.println("Using VlcAudioPlayer:");
        mediaPlayerImpl.playMedia(fileName);
    }
}