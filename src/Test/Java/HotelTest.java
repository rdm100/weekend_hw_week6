import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Bedroom bedroom5;
    DiningRoom diningRoom1;
    Conference conferenceroom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @Before
    public void before(){
        hotel1 = new Hotel(200, "Copocabana");
        bedroom1 = new Bedroom(RoomType.SINGLE.getCapacity(), 1, RoomType.SINGLE, 50.00);
        bedroom2 = new Bedroom(RoomType.SINGLE.getCapacity(), 2, RoomType.SINGLE, 50.00);
        bedroom3 = new Bedroom(RoomType.DOUBLE.getCapacity(), 3, RoomType.DOUBLE, 100.00);
        bedroom4 = new Bedroom(RoomType.DOUBLE.getCapacity(), 4, RoomType.DOUBLE, 100.00);
        bedroom5 = new Bedroom(RoomType.DOUBLE.getCapacity(), 5, RoomType.DOUBLE, 100.00);
        diningRoom1 = new DiningRoom(100, "Viva");
        conferenceroom1 = new Conference(100, "Executive", 1000.00);
        guest1 = new Guest("Dave");
        guest2 = new Guest("Jenny");
        guest3 = new Guest("Tom");
        guest4 = new Guest("Michelle");
        guest5 = new Guest("Paul");
    }

    @Test
    public void hotel1HasName(){
        assertEquals("Copocabana", hotel1.getName());
    }

    @Test
    public void hotel1CanChangeName(){
        hotel1.setName("Ritz");
        assertEquals("Ritz", hotel1.getName());
    }

    @Test
    public void hotel1HasBedrooms(){
        hotel1.addBedroom(bedroom1);
        hotel1.addBedroom(bedroom2);
        hotel1.addBedroom(bedroom3);
        hotel1.addBedroom(bedroom4);
        hotel1.addBedroom(bedroom5);
        assertEquals(5, hotel1.numberOfBedrooms());
    }

    @Test
    public void hotel1HasDiningRoom(){
        hotel1.addDiningRoom(diningRoom1);
        assertEquals(1, hotel1.numberOfDiningRooms());
    }

    @Test
    public void hotel1HasConferenceRoom(){
        hotel1.addConferenceRoom(conferenceroom1);
        assertEquals(1, hotel1.numberOfConferenceRooms());
    }

    @Test
    public void hotel1CanCheckInGuestsToBedrooms(){
        hotel1.addBedroom(bedroom3);
        hotel1.addGuestToRoom(guest1);
        hotel1.addGuestToRoom(guest2);
        assertEquals(2, hotel1.numberOfGuestsInRoom());
    }

    @Test
    public void hotel1CannotCheckInGuestsToBedroomsBecauseAtCapacity(){
        hotel1.addBedroom(bedroom3);
        hotel1.addGuestToRoom(guest1);
        hotel1.addGuestToRoom(guest2);
        hotel1.addGuestToRoom(guest3);
        assertEquals(2, hotel1.numberOfGuestsInRoom());
    }

    @Test
    public void hotel1CanCheckInGuestsToDiningRooms(){
        hotel1.addDiningRoom(diningRoom1);
        hotel1.addGuestToRoom(guest1);
        hotel1.addGuestToRoom(guest2);
        assertEquals(2, hotel1.numberOfGuestsInRoom());
    }

    @Test
    public void hotel1CanCheckInGuestsToConferenceRooms(){
        hotel1.addConferenceRoom(conferenceroom1);
        hotel1.addGuestToRoom(guest1);
        hotel1.addGuestToRoom(guest2);
        assertEquals(2, hotel1.numberOfGuestsInRoom());
    }

}
