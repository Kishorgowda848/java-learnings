public class SendEmail implements OrderPlaceInterface{

    public SendEmail(OrderPlace orderplace){
      orderplace.addSubscriber(this);
    }

    @Override
    public void orderPlaced(int orderID) {
        System.out.println("Email Sending For OrderID "+orderID);
    }
    
}
