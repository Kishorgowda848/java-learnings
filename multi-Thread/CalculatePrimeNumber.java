import java.util.ArrayList;
import java.util.Scanner;

public class CalculatePrimeNumber {
    
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> threads = new ArrayList<>();
        
        Runnable rr = () -> {
            while(true){
                try {
                    Thread.sleep(5000);
                    printStatusOfThread(threads);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        };
        Thread tr = new Thread(rr);
        tr.setDaemon(true);
        tr.start();


        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter the number");
            int value = in.nextInt();
            if(value==0){
                System.out.println("Waiting For thread to finish");
                tr.interrupt();
                waitForThread(threads);
              break;
            }else{
                Runnable r = new Runnable(){
                    @Override
                    public void run(){
                        System.out.println("Results ..."+Calculate.isPrimeNumber(value));
                    }
                };

                Thread t = new Thread(r);
                threads.add(t);
                t.setDaemon(true);
                t.start();
                // System.out.print(Calculate.isPrimeNumber(value));
            }
    
            System.out.println(value);
        }

    }

    public static void printStatusOfThread(ArrayList<Thread> threads){
        threads.forEach(thread->{
           System.out.print(thread.getState()+"  ");
        });
    }

    public  static void waitForThread(ArrayList<Thread> threads) throws InterruptedException{
        for(Thread thread : threads){
            thread.join();
        }
    }
}
