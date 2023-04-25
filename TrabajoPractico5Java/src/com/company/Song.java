package com.company;

import java.util.ArrayList;

public class Song {
    private String name;
    private int duration;
    private Genre genre;
    private Album album;
    private Artist featuringArtist;

    public Song() {
    }

    public Song(String name, int duration, Genre genre, Album album, Artist featuringArtist) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.featuringArtist = featuringArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getFeaturingArtist() {
        return featuringArtist;
    }

    public void setFeaturingArtist(Artist featuringArtist) {
        this.featuringArtist = featuringArtist;
    }
    public Song searchSong(String songName, ArrayList<Song> songs) {
        for (Song song : songs) {
            if (song.getName().equals(songName)) {
                return song;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "\nSong{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", album=" + album +
                ", featuringArtist=" + featuringArtist +
                '}';
    }
}
