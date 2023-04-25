package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class SpotifyBasico extends Song implements Play{
    private String name;
    private Stack<Song> playlist=new Stack<Song>();

    @Override
    public void playSong() {
        System.out.println(playlist.peek());
        playlist.pop();
    }

    @Override
    public void addSongToPlaylist(String songName, ArrayList<Song> songs) {
        Song song=searchSong(songName,songs);
        if (song!=null)
        {
            playlist.push(song);
        }
        else System.out.println("Song not found");
    }

    @Override
    public void deleteSongFromPlaylist() {
        System.out.println("To access these options, purchase the PREMIUM package");
    }

    @Override
    public void showPlaylist() {
        Stack<Song> aux=new Stack<Song>();
        int i=1;
        while (!playlist.empty())
        {

            aux.push(playlist.peek());
            playlist.pop();
        }
        while (!aux.empty())
        {
            System.out.println(i+". "+aux.peek());
            playlist.push(aux.peek());
            aux.pop();
            i++;
        }
    }
}
