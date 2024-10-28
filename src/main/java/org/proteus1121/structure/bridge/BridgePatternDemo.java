package org.proteus1121.structure.bridge;

import org.proteus1121.structure.bridge.audio.AudioPlayer;
import org.proteus1121.structure.bridge.audio.Mp3AudioPlayer;
import org.proteus1121.structure.bridge.audio.Mp4AudioPlayer;
import org.proteus1121.structure.bridge.audio.VlcAudioPlayer;
import org.proteus1121.structure.bridge.media.Mp3Driver;
import org.proteus1121.structure.bridge.media.Mp4Driver;
import org.proteus1121.structure.bridge.media.VlcDriver;

public class BridgePatternDemo {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new Mp3AudioPlayer(new Mp3Driver());
        AudioPlayer mp4Player = new Mp4AudioPlayer(new Mp4Driver());
        AudioPlayer vlcPlayer = new VlcAudioPlayer(new VlcDriver());

        mp3Player.play("song.mp3");
        mp4Player.play("video.mp4");
        vlcPlayer.play("movie.vlc");
    }
}