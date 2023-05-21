package com.irrelvnt.nsync.ui.song;

public class Song {
    String title;
    String url;
    String artist;
    int image;

    public Song(String title, String artist, int image, String url) {
        this.title = title;
        this.artist = artist;
        this.image = image;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getImage() {
        return image;
    }
}