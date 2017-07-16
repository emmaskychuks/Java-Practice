package com.company;

/**
 * Created by emmas on 7/5/2017
 */
public class Song
{
    private String songTitle;
    private int songDurationInMin;


    public Song(String songTitle, int songDurationInMin)
    {
        this.songTitle = songTitle;
        this.songDurationInMin = songDurationInMin;
    }

    public String getSongTitle()
    {
        return songTitle;
    }

    public int getSongDurationInMin() {
        return songDurationInMin;
    }

    @Override
    public String toString() {
        return songTitle;
    }
}
