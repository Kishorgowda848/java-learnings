public class SendNotification implements OrderPlaceInterface {

    public SendNotification(OrderPlace orderPlace){
      orderPlace.addSubscriber(this);
    }

    @Override
    public void orderPlaced(int orderID) {
        // TODO Auto-generated method stub
        System.out.println("Sending Notification ... orderId "+orderID);
    }
    
}
