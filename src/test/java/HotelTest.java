import Hotel.Hotel;
import RoomTypes.Bedroom;
import RoomTypes.BedroomType;
import RoomTypes.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(3, 1, BedroomType.TRIPLE);
        bedroom2 = new Bedroom(2, 2, BedroomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(20, "The Robertson Room");
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
}
