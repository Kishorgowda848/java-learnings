package Lock;

public class LockDemoMain {
    public static void main(String[] args) {
        LockDemo counter = new LockDemo();   
        new Thread(counter,"one").start();
        new Thread(counter,"Two").start();
        new Thread(counter,"Three").start();
        new Thread(counter,"four").start();
        new Thread(counter,"Five").start();
    }
}
