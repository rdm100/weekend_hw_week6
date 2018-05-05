import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(10, RoomType.SINGLE, 50.00);
        guest = new Guest();
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasType(){
        assertEquals("Single", bedroom.getRoomTypeStringFromEnum());
    }

    @Test
    public void bedroomHasRate(){
        assertEquals(50.00, bedroom.getRoomRate(), 0.1);
    }

    @Test
    public void bedroomCanCheckInGuest(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.numberOfGuestsInRoom());
    }

    @Test
    public void bedroomCanCheckOutGuest(){
        bedroom.addGuestToRoom(guest);
        bedroom.checkOutGuest(guest);
        assertEquals(0, bedroom.numberOfGuestsInRoom());
    }


}//end of class
