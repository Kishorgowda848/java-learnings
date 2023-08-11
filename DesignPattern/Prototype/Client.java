public class Client {
    
    public static void main(String[] args) {
        ProtoTypeRegistory registory = new ProtoTypeRegistory();
        Vehicle car = new Car("KA15LE3298000", "Petrol","BMW");

        registory.addClass("car", car);

        Vehicle c1 = registory.getVehicleClass("car").copy();

        System.out.println(c1.getNumber());
    }
}
