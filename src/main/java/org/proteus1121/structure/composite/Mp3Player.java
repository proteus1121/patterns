package org.proteus1121.structure.composite;

class Mp3Player implements MediaComponent {
    public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}
