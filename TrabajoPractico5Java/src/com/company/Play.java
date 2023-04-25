package com.company;

import java.util.ArrayList;

public interface Play {
    void playSong();
    void addSongToPlaylist(String songName, ArrayList<Song> songs);
    void deleteSongFromPlaylist();
    void showPlaylist();
}
