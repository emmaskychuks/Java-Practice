package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by emmas on 7/9/2017
 */
public class PlayList
{
    private String name;
    private boolean forward;
    private ArrayList<Album> albums;
    private LinkedList<Song> songs;
    ListIterator<Song> songListIterator;

    public PlayList(String name)
    {
        this.name = name;
        albums = new ArrayList<>();
        songs = new LinkedList<>();
        songListIterator = songs.listIterator();
    }

    public void addSong(String songName)
    {
        if(!findSong(songName, true))
        {
            Song song = new Song(songName, 5);
            songs.add(song);
        }
        else
            System.out.println("Song already exist");
    }
    public void removeSong(String songName)
    {
        ListIterator<Song> songListIterator = findSong(songName);
        songListIterator.remove();
    }
    public void startPlayList()
    {
        playSong();
    }
    public void restartPlayList()
    {
        songListIterator = songs.listIterator();
        playSong();
    }
    private ListIterator findSong(String songName)
    {
        ListIterator<Song> songIterator = songs.listIterator();
        while(songIterator.hasNext()) {
            if(songIterator.next().getSongTitle().equals(songName))
            return songIterator;
        }
        return null;
    }
    private boolean findSong(String songName, boolean choice)
    {
        ListIterator<Song> songIterator = songs.listIterator();
        while(songIterator.hasNext()) {
            if(songIterator.next().getSongTitle().equals(songName))
                return  true;
        }
        return false;
    }
    private void playSong()
    {
        if(!songs.isEmpty() && songListIterator.hasNext())
            System.out.println(songListIterator.next().toString() + " is playing...");
        else
            System.out.println("There is no more songs on the list to be played");
}
    public void skipForward()
    {
        if(songListIterator.hasNext())
            songListIterator.next();
        playSong();
    }
    public void skipBackward()
    {
        if(songListIterator.hasPrevious())
            songListIterator.previous();
        playSong();
    }
    public void replay()
    {
        if(songListIterator.hasPrevious())
            songListIterator.previous();
        playSong();
    }
}
