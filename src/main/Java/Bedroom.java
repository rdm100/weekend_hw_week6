public class Bedroom extends Room{

    private RoomType roomtype;
    private double roomRate;
    private int roomNumber;


    public Bedroom(RoomType roomtype, double roomRate, int roomNumber){
        super(roomtype.getCapacity());


    }



}
