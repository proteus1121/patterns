package org.proteus1121.structure.composite;

class VlcPlayer implements MediaComponent {
    public void play(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}