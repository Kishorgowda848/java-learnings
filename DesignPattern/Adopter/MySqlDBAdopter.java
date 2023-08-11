public class MySqlDBAdopter implements Database {

    @Override
    public void connect() {
        System.out.println("Hey MySQL Driver is Connecting ...");
    }
    
}
