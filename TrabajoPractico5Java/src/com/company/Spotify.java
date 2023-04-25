package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Spotify extends Song implements Play {
    private String name;
    private Stack<Song> playlist=new Stack<Song>();

    public Spotify(String name) {
        this.name = name;
    }

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
        Stack<Song> aux=new Stack<Song>();
        Scanner scanner=new Scanner(System.in);
        int size=playlist.size();
        int i=1;
        showPlaylist();
        while (!playlist.empty())
        {
            aux.push(playlist.peek());
            playlist.pop();
        }
        System.out.println("Choose an option");
        int option= Integer.parseInt(scanner.nextLine());
        while (!aux.empty())
        {
            if (i!=option)
            {
                playlist.push(aux.peek());
                aux.pop();
            }
            else aux.pop();
            i++;
        }
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

    @Override
    public String toString() {
        return "Spotify{" +
                "name='" + name + '\'' +
                ", playlist=" + playlist +
                '}';
    }
}
