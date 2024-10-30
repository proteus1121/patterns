package org.proteus1121.behavioral.observer;

// Интерфейс наблюдаемого объекта (субъекта)
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}