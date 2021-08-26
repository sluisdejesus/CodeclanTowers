package Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests =new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfGuestsInRoomOnTheDay() {
        return this.guests.size();
    }

    public void checkInGuest(Guest guest){
        this.guests.add(guest);
    }

    public void checkOutGuest(Guest guest){
        this.guests.remove(guest);
    }


}
