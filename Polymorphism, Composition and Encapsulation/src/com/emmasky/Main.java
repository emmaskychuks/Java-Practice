package com.emmasky;

public class Main {

    public static void main(String[] args)
    {
	    Bed bed = new Bed("King", 2);
	    Chair chair = new Chair(5,5,16);
	    Table table = new Table(50, "Wood");

	    Room room = new Room(chair, table, bed);
	    room.arrangeRoom();
    }
}
