public class Car extends Vehicle {
    private String name;
    
    public Car(String number,String fuletype, String name){
        super(number,fuletype);
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car copy(){
        System.out.println("Hey This Car Copy Contructor");
        return new Car(this.getNumber(),this.getFuleType(),this.name);
    }

}
