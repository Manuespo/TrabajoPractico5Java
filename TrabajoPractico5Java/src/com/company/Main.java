package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArrayList<Song> songs=new ArrayList<Song>();
        Spotify spotify =new Spotify("Jorge");

// Song 1
        Artist artist1 = new Artist("John Doe", 28, "USA");
        Album album1 = new Album(2021, "The Greatest Hits", artist1);
        songs.add(new Song("Song 1", 240, Genre.POP, album1, null));

// Song 2
        Artist artist2 = new Artist("Jane Smith", 35, "UK");
        Album album2 = new Album(2005, "Music Revolution", artist2);
        songs.add(new Song("Song 2", 180, Genre.ROCK, album2, null));

// Song 3
        Artist artist3 = new Artist("Alex Rodriguez", 29, "Mexico");
        Album album3 = new Album(2018, "Latino Hits", artist3);
        songs.add(new Song("Song 3", 200, Genre.LATIN, album3, artist2));

// Song 4
        Artist artist4 = new Artist("Maria Garcia", 25, "Spain");
        Album album4 = new Album(2012, "Flamenco Nights", artist4);
        songs.add(new Song("Song 4", 150, Genre.WORLD, album4, null));

// Song 5
        Artist artist5 = new Artist("David Kim", 32, "South Korea");
        Album album5 = new Album(2016, "K-Pop Sensation", artist5);
        songs.add(new Song("Song 5", 190, Genre.POP, album5, null));

// Song 6
        Artist artist6 = new Artist("Juan Perez", 30, "Argentina");
        Album album6 = new Album(2014, "Tango Forever", artist6);
        songs.add(new Song("Song 6", 220, Genre.WORLD, album6, null));

// Song 7
        Artist artist7 = new Artist("Oliver Schmidt", 27, "Germany");
        Album album7 = new Album(2008, "Electronica Dreams", artist7);
        songs.add(new Song("Song 7", 300, Genre.ELECTRONIC, album7, null));

// Song 8
        Artist artist8 = new Artist("Luisa Martinez", 33, "Mexico");
        Album album8 = new Album(2019, "Banda Fever", artist8);
        songs.add(new Song("Song 8", 260, Genre.LATIN, album8, artist3));

// Song 9
        Artist artist9 = new Artist("Roberto Hernandez", 26, "Colombia");
        Album album9 = new Album(2013, "Reggaeton Party", artist9);
        songs.add(new Song("Song 9", 180, Genre.REGGAETON, album9, null));

// Song 10
        Artist artist10 = new Artist("Anna Lee", 31, "Russia");
        Album album10 = new Album(2007, "Classical Treasures", artist10);
        songs.add(new Song("Song 10", 300, Genre.CLASSICAL, album10, null));
// Song 11
        Artist artist11 = new Artist("Miguel Gonzalez", 24, "Spain");
        Album album11 = new Album(2015, "Folkloric Songs", artist4);
        songs.add(new Song("Song 11", 210, Genre.LATIN, album11, null));

// Song 12
        Artist artist12 = new Artist("Yuna Lee", 27, "South Korea");
        Album album12 = new Album(2019, "Korean Pop Vol. 2", artist5);
        songs.add(new Song("Song 12", 190, Genre.POP, album12, null));

// Song 14
        songs.add(new Song("Song 14", 180, Genre.ELECTRONIC, album7, null));

// Song 15
        songs.add(new Song("Song 15", 240, Genre.CLASSICAL, album8, null));

// Song 16
        songs.add(new Song("Song 16", 200, Genre.REGGAETON, album9, null));

// Song 17
        songs.add(new Song("Song 17", 190, Genre.CLASSICAL, album10, null));

// Song 18
        songs.add(new Song("Song 18", 170, Genre.LATIN, album11, null));

// Song 19
        songs.add(new Song("Song 19", 210, Genre.POP, album12, null));

// Song 20
        songs.add(new Song("Song 20", 185, Genre.ROCK, album1, null));

// Song 21
        songs.add(new Song("Song 21", 220, Genre.JAZZ, album2, null));

// Song 22
        songs.add(new Song("Song 22", 195, Genre.LATIN, album3, null));

// Song 23
        songs.add(new Song("Song 23", 160, Genre.LATIN, album4, null));
// Song 24
        songs.add(new Song("Song 24", 175, Genre.ROCK, album1, null));

// Song 25
        songs.add(new Song("Song 25", 230, Genre.JAZZ, album2, null));

// Song 26
        songs.add(new Song("Song 26", 190, Genre.LATIN, album3, null));

// Song 27
        songs.add(new Song("Song 27", 180, Genre.LATIN, album4, null));

// Song 28
        songs.add(new Song("Song 28", 205, Genre.ELECTRONIC, album7, null));

// Song 29
        songs.add(new Song("Song 29", 250, Genre.TRAP, album8, null));

// Song 30
        songs.add(new Song("Song 30", 195, Genre.REGGAETON, album9, null));

// Song 31
        songs.add(new Song("Song 31", 200, Genre.METAL, album10, null));

// Song 32
        songs.add(new Song("Song 32", 190, Genre.HIPHOP, album11, null));

// Song 33
        songs.add(new Song("Song 33", 185, Genre.POP, album12, null));

    spotify.addSongToPlaylist("Song 31",songs);
        spotify.addSongToPlaylist("Song 29",songs);
        spotify.addSongToPlaylist("Song 22",songs);
        spotify.addSongToPlaylist("Song 11",songs);
        spotify.addSongToPlaylist("Song 8",songs);
        spotify.addSongToPlaylist("Song 25",songs);
        spotify.addSongToPlaylist("Song 4",songs);
        spotify.addSongToPlaylist("Song 28",songs);
        spotify.deleteSongFromPlaylist();
        spotify.showPlaylist();







    }
}
