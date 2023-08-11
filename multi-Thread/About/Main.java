public class Main{
  public static void main(String[] args) {
      /** Thread 1 and Thread 2 are Running */
    Thread t1 = new Thread(()->System.out.println("thread 1"));
    t1.start();
    Thread t2 = new Thread(()->System.out.println("thread 2"));
    t2.start();
    Thread t3 = new Thread(()->System.out.println("thread 3"));
    t3.start();
  }
  //Thread class
  //Ruynable is an interface provided by java sdk
}
