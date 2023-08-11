public class Client {

    public static void main(String[] args) {
        Database db = new MongoDBAdopter();
        db.connect();
    }
}
