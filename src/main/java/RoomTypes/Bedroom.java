package RoomTypes;

import Hotel.Guest;
import Room.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;

    public Bedroom(int capacity, ArrayList<Guest> guests){
        super(capacity, guests);
    }

}
