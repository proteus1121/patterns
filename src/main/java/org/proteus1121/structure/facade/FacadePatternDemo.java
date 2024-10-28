package org.proteus1121.structure.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        // Создаем фасад для управления медиаплеерами
        MediaFacade mediaFacade = new MediaFacade();

        // Воспроизведение файлов разных форматов
        mediaFacade.play("song.mp3");
        mediaFacade.play("video.mp4");
        mediaFacade.play("movie.vlc");
        mediaFacade.play("audio.wav"); // Неподдерживаемый формат
    }
}