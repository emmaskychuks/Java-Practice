package com.emmasky;

/**
 * Created by emmas on 5/24/2017.
 */
public class Chair
{
    private int width;
    private int height;
    private int weight;
    private int xPosition;
    private int yPosition;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public Chair(int width, int height, int weight)
    {
        this.width = width;
        this.height = height;

        this.weight = weight;
    }
    public void move(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }
}
