public class Bedroom extends Room{

    private int roomNumber;
    private RoomType type;
    private double roomRate;

    public Bedroom(int capacity, int roomNumber, RoomType type, double roomRate){
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
        this.roomRate = roomRate;
    }

    public RoomType getRoomtype() {
        return type;
    }

    public String getRoomTypeStringFromEnum() {
        return type.getType();
    }

    public void setRoomtype(RoomType roomtype) {
        this.type = roomtype;
    }

    public int getRoomCapacityStringFromEnum() {
        return type.getCapacity();
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }



}//end of class
