import java.util.ArrayList;

public class Hotel extends Room{

        private ArrayList<Bedroom> bedrooms;
        private ArrayList<Conference> conferenceRooms;
        private ArrayList<DiningRoom> diningRooms;
        private String name;


        public Hotel(int capacity, String name) {
            super(capacity);
            this.bedrooms = new ArrayList<>();
            this.conferenceRooms = new ArrayList<>();
            this.diningRooms = new ArrayList<>();
            this.name = name;
        }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int numberOfBedrooms(){
        return this.bedrooms.size();
    }

    public ArrayList<Conference> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<Conference> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addConferenceRoom(Conference conference){
        this.conferenceRooms.add(conference);
    }

    public int numberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void setDiningRooms(ArrayList<DiningRoom> diningRooms) {
        this.diningRooms = diningRooms;
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.add(diningRoom);
    }

    public int numberOfDiningRooms(){
            return this.diningRooms.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}//end of class
