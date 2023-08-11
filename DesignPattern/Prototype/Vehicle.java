public class Vehicle {
    
    private String number;

    private String fuleType;

    public Vehicle(String number, String fuleType) {
        this.number = number;
        this.fuleType = fuleType;
    }

   public Vehicle copy(){
       return new Vehicle(this.number,this.fuleType);
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFuleType() {
        return this.fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

}
