import java.util.HashMap;
import java.util.Map;

public class ProtoTypeRegistory {

    Map<String,Vehicle> registory = new HashMap<>();

    public Vehicle getVehicleClass(String key){
      return this.registory.get(key);
    }


    public void addClass(String key,Vehicle calss){
        this.registory.put(key, calss);
    }
}
