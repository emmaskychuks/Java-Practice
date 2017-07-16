package com.emmasky;

/**
 * Created by emmas on 5/24/2017.
 */
public class Room
{
    public Chair chair;
    public Table table;
    public Bed bed;
    public Size size;

    public Room(Chair chair, Table table, Bed bed) {
        this.chair = chair;
        this.table = table;
        this.bed = bed;
    }

    public void arrangeRoom()
    {
        System.out.println("Arranging Room");
        chair.move(5,12);
        table.move(5, 5);
        bed.move(20, 20);
    }
}
