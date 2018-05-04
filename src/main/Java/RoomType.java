public enum RoomType {
    SINGLE("Single", 1),
    DOUBLE("Double", 2);

    private String type;
    private int capacity;

    RoomType(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
    }

    public String getType(){
        return type;
    };
    public int getCapacity(){
        return capacity;
    };
}//end of enum

