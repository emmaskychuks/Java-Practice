package com.emmasky;

/**
 * Created by emmas on 5/24/2017.
 */
public class Bed
{
    private String size;
    private int numberOfSheets;
    private int xPosition;
    private int yPosition;

    public Bed(String size, int numberOfSheets) {
        this.size = size;
        this.numberOfSheets = numberOfSheets;
    }

    public void move(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }
}
