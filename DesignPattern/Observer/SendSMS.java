public class SendSMS implements OrderPlaceInterface {

    @Override
    public void orderPlaced(int orderID) {
        System.out.println("Sending SMS ..."+orderID);
    }
    
}
