package org.proteus1121.structure.adapter.player;

// Реализация для воспроизведения VLC
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    public void playMp4(String fileName) {
        // Ничего не делаем
    }
}
