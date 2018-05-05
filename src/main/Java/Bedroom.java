public class Bedroom extends Room{

    private int roomNumber;
    private RoomType type;
    private double roomRate;

    public Bedroom(int roomNumber, RoomType roomtype, double roomRate){
        super(roomtype.getCapacity());
        this.roomNumber = roomNumber;
        this.type = roomtype;
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


}
