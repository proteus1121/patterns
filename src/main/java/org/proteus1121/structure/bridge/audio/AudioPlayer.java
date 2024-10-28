package org.proteus1121.structure.bridge.audio;


import org.proteus1121.structure.bridge.media.MediaPlayer;

public abstract class AudioPlayer {
    protected MediaPlayer mediaPlayerImpl;

    public AudioPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayerImpl = mediaPlayer;
    }

    public abstract void play(String fileName);
}