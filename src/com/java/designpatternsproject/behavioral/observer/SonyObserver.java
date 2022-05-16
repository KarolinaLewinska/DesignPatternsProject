package com.java.designpatternsproject.behavioral.observer;

public class SonyObserver extends Observer {
    public SonyObserver(MusicPlayer musicPlayer) {
        super("Sony");
        this.musicPlayer = musicPlayer;
        this.musicPlayer.addMusicPlayerObserver(this);
    }

    @Override
    public void changeSong() {
        System.out.println("Changed to Sony Music Player");
        System.out.println("Current song: " + musicPlayer.getCurrentSongTitle());
    }
}