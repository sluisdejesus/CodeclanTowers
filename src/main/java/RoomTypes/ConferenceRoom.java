package RoomTypes;

import Hotel.Guest;
import Room.Room;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private ConferenceRoomType conferenceRoomType;

    public ConferenceRoom(String name, ConferenceRoomType conferenceRoomType){
        super();
        this.name = name;
        this.conferenceRoomType = conferenceRoomType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
