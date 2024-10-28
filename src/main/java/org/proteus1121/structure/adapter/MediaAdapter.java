package org.proteus1121.structure.adapter;

import org.proteus1121.structure.adapter.audio.MediaPlayer;
import org.proteus1121.structure.adapter.player.AdvancedMediaPlayer;
import org.proteus1121.structure.adapter.player.Mp4Player;
import org.proteus1121.structure.adapter.player.VlcPlayer;

// Адаптер для использования AdvancedMediaPlayer в MediaPlayer
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}