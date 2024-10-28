package org.proteus1121.structure.composite;

import java.util.ArrayList;
import java.util.List;

// Компоновщик, содержащий другие MediaComponent
class MediaGroup implements MediaComponent {
    private List<MediaComponent> mediaComponents = new ArrayList<>();

    // Метод добавления компонента (либо проигрывателя, либо группы)
    public void add(MediaComponent mediaComponent) {
        mediaComponents.add(mediaComponent);
    }

    // Метод удаления компонента
    public void remove(MediaComponent mediaComponent) {
        mediaComponents.remove(mediaComponent);
    }

    // Метод воспроизведения всех добавленных компонентов
    public void play(String fileName) {
        for (MediaComponent mediaComponent : mediaComponents) {
            mediaComponent.play(fileName);
        }
    }
}