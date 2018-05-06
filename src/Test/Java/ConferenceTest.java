import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference1;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        conference1 = new Conference(100, "Executive", 1000.00);
        guest1 = new Guest("Dave");
        guest2 = new Guest("Jenny");
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conference1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Executive", conference1.getName());
    }

    @Test
    public void hasDailyRate() {
        assertEquals(1000.00, conference1.getDailyRate(), 0.1);
    }

    @Test
    public void coferenc1CanCheckInGuest(){
        conference1.addGuestToRoom(guest1);
        assertEquals(1, conference1.numberOfGuestsInRoom());
    }

    @Test
    public void coferenc1anCheckOutGuest() {
        conference1.addGuestToRoom(guest1);
        conference1.checkOutGuest(guest1);
        assertEquals(0, conference1.numberOfGuestsInRoom());
    }

}
