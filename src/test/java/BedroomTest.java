import Hotel.Guest;
import RoomTypes.Bedroom;
import RoomTypes.BedroomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(1, BedroomType.DOUBLE);
        guest1 = new Guest("Connor");
        guest2 = new Guest("Sara");
    }

    @Test
    public void canGetNumberOfGuestsInRoomOnTheDayStartEmpty(){
        assertEquals(0, bedroom.getNumberOfGuestsInRoomOnTheDay());
    }

    @Test
    public void bedroomHasType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getBedroomType());
    }

//    @Test
//    public void bedroomHasCapacity(){
//        assertEquals(2, BedroomType.getCapacity());
//    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canCheckInGuest(){
        bedroom.checkInGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuestsInRoomOnTheDay());
    }

    @Test
    public void canCheckOutGuest(){
        bedroom.checkInGuest(guest1);
        bedroom.checkInGuest(guest2);
        bedroom.checkOutGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuestsInRoomOnTheDay());
    }


}
