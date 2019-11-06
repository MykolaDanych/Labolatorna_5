package appliances;

public class ElectricalAppliance {
   private boolean condition;
   private double power;
   private double price;
   private int id;


    public boolean onOrOff(){
        return condition;
    }

    public void info(){

    }

    public boolean isCondition() {
        return condition;
    }

    public double getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
}
