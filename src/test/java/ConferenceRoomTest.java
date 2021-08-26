import Hotel.Guest;
import RoomTypes.ConferenceRoom;
import RoomTypes.ConferenceRoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){

        conferenceRoom = new ConferenceRoom("The Robertson Room", ConferenceRoomType.LARGE);
        guest = new Guest("Sara");
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("The Robertson Room", conferenceRoom.getName());
    }

//    @Test
//    public void conferenceRoomHasCapacity(){
//        assertEquals(20, conferenceRoom.getCapacity());
//    }

    @Test
    public void canGetNumberOfGuestsInRoomOnTheDayStartEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuestsInRoomOnTheDay());
    }

    @Test
    public void canCheckInGuest(){
        conferenceRoom.checkInGuest(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuestsInRoomOnTheDay());
    }

    @Test
    public void canCheckOutGuest(){
        conferenceRoom.checkInGuest(guest);
        conferenceRoom.checkOutGuest(guest);
        assertEquals(0, conferenceRoom.getNumberOfGuestsInRoomOnTheDay());
    }
}
