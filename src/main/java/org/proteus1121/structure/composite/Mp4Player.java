package org.proteus1121.structure.composite;

class Mp4Player implements MediaComponent {
    public void play(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}