public class MongoDBAdopter implements Database{

    @Override
    public void connect() {
      System.out.println("! Hey .. Connecting to mongo DB");
    }
    
}
