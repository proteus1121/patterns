package org.proteus1121.structure.adapter.player;

// Реализация для воспроизведения MP4
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // Ничего не делаем
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}