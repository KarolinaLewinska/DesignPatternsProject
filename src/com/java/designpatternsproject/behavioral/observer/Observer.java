package com.java.designpatternsproject.behavioral.observer;

public abstract class Observer {
    protected MusicPlayer musicPlayer;
    private String observerName;

    public Observer(String observerName) {
        this.observerName = observerName;
    }

    public String getObserverName() {
        return observerName;
    }

    public abstract void changeSong();
}