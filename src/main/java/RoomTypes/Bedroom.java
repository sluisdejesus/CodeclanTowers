package RoomTypes;

import Hotel.Guest;
import Room.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int capacity;
    private int roomNumber;

    public Bedroom(int roomNumber, BedroomType bedroomType){
        super();
        this.capacity = bedroomType.getCapacity();
        this.roomNumber = roomNumber;
        this.bedroomType = bedroomType;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(BedroomType bedroomType) {
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }




}
