package com.java.designpatternsproject.behavioral.observer;

public class AppleObserver extends Observer {
    public AppleObserver(MusicPlayer musicPlayer) {
        super("Apple");
        this.musicPlayer = musicPlayer;
        this.musicPlayer.addMusicPlayerObserver(this);
    }

    @Override
    public void changeSong() {
        System.out.println("Changed to Apple Music Player");
        System.out.println("Current song: " + musicPlayer.getCurrentSongTitle());
    }
}