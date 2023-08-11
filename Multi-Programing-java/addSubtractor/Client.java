import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    
    public static void  main(String arg[]) throws InterruptedException{
        Count count = new Count();
        Add addTask = new Add(count);
        Sub subTask = new Sub(count);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(addTask);
        executorService.execute(subTask);

        executorService.shutdown();
        executorService.awaitTermination(100, TimeUnit.MINUTES);

        System.out.println(count.value);

    }
}
