public class SingleRoom extends Room{

    private String type;
    private Double nightlyRate;

    public SingleRoom(String name, int capacity, String type, Double nightlyRate) {
        super(capacity);
        this.type = type;
        this.nightlyRate = nightlyRate;
    }




}//end of class
