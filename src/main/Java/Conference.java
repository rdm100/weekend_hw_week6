public class Conference extends Room{


    private String name;
    private double dailyRate;

    public Conference(int capacity, String name, double dailyRate) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
