package Flight;

import java.util.List;

public class FlightC {

    private String name;
    private boolean control;
    private boolean business;
    private int businessPrice;
    private int economicPrice;
    private List<String> seats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getEconomicPrice() {
        return economicPrice;
    }

    public void setEconomicPrice(int economicPrice) {
        this.economicPrice = economicPrice;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }
}
