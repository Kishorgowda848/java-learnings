import java.util.ArrayList;
import java.util.List;

public class OrderPlace {
    
    private List<OrderPlaceInterface> observers  = new ArrayList<>();
    private int orderId;

    public void onOrderPlaced(){

        for( OrderPlaceInterface order :observers){
            order.orderPlaced(this.orderId);
        }
        
    }

    public void addSubscriber(OrderPlaceInterface orderPlace){
        observers.add(orderPlace);
    }
}
