public class Client {
    
    public static void main(String args[]){
        Student singleTon1 = Singleton.getInstance();
        Student singleTon2 = Singleton.getInstance();
    }
}
