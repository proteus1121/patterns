package org.proteus1121.structure.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Создание отдельных проигрывателей
        MediaComponent mp3Player = new Mp3Player();
        MediaComponent mp4Player = new Mp4Player();
        MediaComponent vlcPlayer = new VlcPlayer();

        // Создание группы и добавление в нее отдельных проигрывателей
        MediaGroup mediaGroup = new MediaGroup();
        mediaGroup.add(mp3Player);
        mediaGroup.add(mp4Player);
        mediaGroup.add(vlcPlayer);

        // Воспроизведение с помощью группы
        System.out.println("Playing all media files in mediaGroup:");
        mediaGroup.play("example_file");

        // Создание вложенной группы
        MediaGroup nestedMediaGroup = new MediaGroup();
        nestedMediaGroup.add(mp3Player);
        nestedMediaGroup.add(mediaGroup);  // Вложение одной группы в другую

        System.out.println("\nPlaying all media files in nestedMediaGroup:");
        nestedMediaGroup.play("nested_file");
    }
}