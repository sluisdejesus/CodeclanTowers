package Hotel;

import RoomTypes.Bedroom;
import RoomTypes.ConferenceRoom;

import java.util.ArrayList;



public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public int getNumberOfBedroomsInHotel() {
        return bedrooms.size();
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int getNumberOfConferenceRoomsInHotel() {
        return conferenceRooms.size();
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

}
