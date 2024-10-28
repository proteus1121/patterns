package org.proteus1121.structure.facade;

class MediaFacade {
    private Mp3Player mp3Player;
    private Mp4Player mp4Player;
    private VlcPlayer vlcPlayer;

    public MediaFacade() {
        this.mp3Player = new Mp3Player();
        this.mp4Player = new Mp4Player();
        this.vlcPlayer = new VlcPlayer();
    }

    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            mp3Player.playMp3(fileName);
        } else if (fileName.endsWith(".mp4")) {
            mp4Player.playMp4(fileName);
        } else if (fileName.endsWith(".vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}