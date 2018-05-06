import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.SINGLE.getCapacity(), 10, RoomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(RoomType.DOUBLE.getCapacity(), 20, RoomType.DOUBLE, 100.00);
        guest1 = new Guest("Dave");
        guest2 = new Guest("Jenny");
    }

    @Test
    public void bedroom1HasCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void Bedroom1HasCapacityFromEnum(){
        assertEquals(1, bedroom1.getRoomCapacityStringFromEnum());
    }

    @Test
    public void bedroom2HasCapacity(){
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(10, bedroom1.getRoomNumber());
    }

    @Test
    public void bedroomHasType(){
        assertEquals("Single", bedroom1.getRoomTypeStringFromEnum());
    }

    @Test
    public void bedroomHasRate(){
        assertEquals(50.00, bedroom1.getRoomRate(), 0.1);
    }

    @Test
    public void bedroomCanCheckInGuest(){
        bedroom1.addGuestToRoom(guest1);
        assertEquals(1, bedroom1.numberOfGuestsInRoom());
    }

    @Test
    public void bedroomCanCheckOutGuest(){
        bedroom1.addGuestToRoom(guest1);
        bedroom1.checkOutGuest(guest1);
        assertEquals(0, bedroom1.numberOfGuestsInRoom());
    }

//    @Test
//    public void particularBedromCanGetListOfGuests(){
//        bedroom2.addGuestToRoom(guest1);
//        bedroom2.addGuestToRoom(guest2);
//
//        assertEquals(guests, bedroom1.getGuests());
//    }

}//end of class
