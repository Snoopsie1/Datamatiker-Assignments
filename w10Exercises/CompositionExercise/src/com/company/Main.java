package com.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Room> rooms = new ArrayList<>();
    public static Room livingRoom = new Room(4,2,2,4);
    public static Room bedRoom = new Room(4,1,1,2);
    public static Room kitchen = new Room(3,1,2,2);
    public static Building house = new Building(rooms,4,3,false);

    public static void main(String[] args)
    {
        rooms.add(livingRoom);
        rooms.add(bedRoom);
        rooms.add(kitchen);



        System.out.println(livingRoom.getNumberOfLamps());
        System.out.println(bedRoom.getNumberOfLamps());
        System.out.println(kitchen.getNumberOfLamps());
        System.out.println("Total number of lamps are: "+totalNumberOfLamps());
        isWeirdHouse();

    }

    public static int totalNumberOfLamps()
    {
       int total = 0;

        for (int i = 0; i < rooms.size(); i++)
        {
            total = total + rooms.get(i).getNumberOfLamps();
        }

       return total;
    }

    public static boolean isWeirdHouse()
    {
        boolean isWeird;
        ArrayList<Room> totalRooms = house.getRooms();
        int totalFloors = house.getNumberOfFloors();

        if (totalRooms.size() > totalFloors)
        {
            isWeird = true;
            System.out.println("The house is weird.");
        }
        else
        {
            isWeird = false;
            System.out.println("The house is not weird.");
        }

        return isWeird;
    }
}
