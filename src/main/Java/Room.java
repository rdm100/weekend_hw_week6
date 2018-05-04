import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int currentRoomTotal(){
        return this.guests.size();
    }

    public int addGuestToRoom(Guest guest){
        this.guests.add(guest);
        return currentRoomTotal();
    }

    public int checkOutGuest(Guest guest){
        this.guests.remove(guest);
        return currentRoomTotal();
    }


}//end of class
