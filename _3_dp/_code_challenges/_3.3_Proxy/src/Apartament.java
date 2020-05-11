public class Apartament {
    private String location;
    private int monthyRentCost;

    public Apartament(String location, int monthyRentCost) {
        this.location = location;
        this.monthyRentCost = monthyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthyRentCost() {
        return monthyRentCost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMonthyRentCost(int monthyRentCost) {
        this.monthyRentCost = monthyRentCost;
    }
}
