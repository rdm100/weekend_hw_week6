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
            this.name = name;
        }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<Conference> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<Conference> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }



}
