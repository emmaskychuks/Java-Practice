package com.company;

import java.util.ArrayList;

/**
 * Created by emmas on 7/5/2017
 */
public class Album
{
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName, ArrayList<Song> songs) {
        this.albumName = albumName;
        this.songs = songs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
