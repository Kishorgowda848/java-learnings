import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class executors {
    
    /**Thraed pool is fixed number of thread created in the begining ,New Task is piked by existing thread  */
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService  scheduledThreadPoolExecutor = Executors.newScheduledThreadPool(1);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = ()->{
            System.out.println("Sheduler Thread Running");
        };
        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable, 1, 3, TimeUnit.SECONDS);

        /** fixed Thread  */
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter the number");
            int value = in.nextInt();
            if(value==0){
              break;
            }else{
                Runnable r = new Runnable(){
                    @Override
                    public void run(){
                        System.out.println("Results ..."+Calculate.isPrimeNumber(value));
                    }
                };

                executorService.execute(r);                        

                // Thread t = new Thread(r);
                // t.setDaemon(true);
                // t.start();
                // System.out.print(Calculate.isPrimeNumber(value));
            }
    
        }

    }

    

    /** Executors Service :- Manages Runable task for me */
}
