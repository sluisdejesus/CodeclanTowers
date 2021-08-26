import Hotel.Hotel;
import Hotel.Guest;
import RoomTypes.Bedroom;
import RoomTypes.BedroomType;
import RoomTypes.ConferenceRoom;
import RoomTypes.ConferenceRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(3,  BedroomType.TRIPLE);
        bedroom2 = new Bedroom(2,  BedroomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("The Robertson Room", ConferenceRoomType.LARGE);
        guest1 = new Guest("Sara");
        guest2 = new Guest("Connor");
        guest3 = new Guest("Nathan");
    }

    @Test
    public void hotelCanHaveBedroomsAdded(){
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        assertEquals(2, hotel.getNumberOfBedroomsInHotel());
    }

    @Test
    public void hotelCanHaveConferenceRoomsAdded(){
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRoomsInHotel());
    }

    @Test
    public void hotelCanCheckGuestsInToRoom(){
        hotel.addBedroomToHotel(bedroom1);
        hotel.checkGuestInToBedroom(bedroom1, guest1);
        assertEquals(1, bedroom1.getNumberOfGuestsInRoomOnTheDay());
    }

    @Test
    public void hotelCanCheckGuestsOutOfRoom(){
        hotel.addBedroomToHotel(bedroom1);
        hotel.checkGuestInToBedroom(bedroom1, guest1);
        hotel.checkGuestInToBedroom(bedroom1, guest2);
        hotel.checkGuestOutOfBedroom(bedroom1,guest1);
        assertEquals(1,bedroom1.getNumberOfGuestsInRoomOnTheDay());
    }
}
