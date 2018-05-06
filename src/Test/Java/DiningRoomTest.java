import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom(100, "Viva");
        guest1 = new Guest("Dave");
        guest2 = new Guest("Jenny");
    }

    @Test
    public void diningRoom1hasCapacity() {
        assertEquals(100, diningRoom1.getCapacity());
    }

    @Test
    public void diningRoom1hasName(){
        assertEquals("Viva", diningRoom1.getName());
    }

    @Test
    public void diningRoom1CanCheckInGuest(){
        diningRoom1.addGuestToRoom(guest1);
        assertEquals(1, diningRoom1.numberOfGuestsInRoom());
    }

    @Test
    public void diningRoom1canCheckOutGuest() {
        diningRoom1.addGuestToRoom(guest1);
        diningRoom1.checkOutGuest(guest1);
        assertEquals(0, diningRoom1.numberOfGuestsInRoom());
    }

}
