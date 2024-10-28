package org.proteus1121.structure.bridge.audio;


import org.proteus1121.structure.bridge.media.MediaDriver;

public abstract class AudioPlayer {
    protected MediaDriver mediaDriverImpl;

    public AudioPlayer(MediaDriver mediaDriver) {
        this.mediaDriverImpl = mediaDriver;
    }

    public abstract void play(String fileName);
}