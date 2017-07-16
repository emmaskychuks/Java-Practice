package com.emmasky;

/**
 * Created by emmas on 5/24/2017.
 */
public class Table
{
    private int size;
    private String designType;
    int xPosition;
    int yPosition;

    public Table(int size, String designType) {
        this.size = size;
        this.designType = designType;
    }

    public int getSize() {
        return size;
    }

    public String getDesignType() {
        return designType;
    }

    public void move(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }
}
