package com.java.designpatternsproject.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Observer> observers = new ArrayList<>();
    private String currentSongTitle;

    public String getCurrentSongTitle() {
        return currentSongTitle;
    }

    public void setCurrentSongTitle(String currentSongTitle) {
        this.currentSongTitle = currentSongTitle;
        informObservers();
    }

    public void addMusicPlayerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer: " + observer.getObserverName() + " added");
    }

    public void removeMusicPlayerObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer: " + observer.getObserverName() + " deleted");
    }

    public void informObservers() {
        observers.forEach(Observer::changeSong);
    }
}