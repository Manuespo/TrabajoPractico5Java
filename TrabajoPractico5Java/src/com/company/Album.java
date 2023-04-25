package com.company;

public class Album {
    private int year;
    private String name;
    private Artist artist;

    public Album(int year, String name, Artist artist) {
        this.year = year;
        this.name = name;
        this.artist = artist;
    }

    public Album() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", artist=" + artist +
                '}';
    }
}
