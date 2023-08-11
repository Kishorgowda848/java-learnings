public class Client {
    
    public static void main(String[] args) {
        OrderPlace orderplace = new OrderPlace();
        SendEmail sendEmail = new SendEmail(orderplace);
        SendNotification sendNotification = new SendNotification(orderplace);

        orderplace.onOrderPlaced();
    }
}
