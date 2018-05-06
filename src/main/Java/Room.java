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

    public int numberOfGuestsInRoom(){
        return this.guests.size();
    }

    public void addGuestToRoom(Guest guest){
         int spacesLeftInRoom = getCapacity() - numberOfGuestsInRoom();
//        int spacesLeftInRoom = capacity - this.guests.size();
         if(spacesLeftInRoom > 0) {
             this.guests.add(guest);
         }
    }

    public int checkOutGuest(Guest guest){
        this.guests.remove(guest);
        return numberOfGuestsInRoom();
    }


}//end of class
