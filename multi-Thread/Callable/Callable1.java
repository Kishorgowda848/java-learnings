import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        Callable<String> c = new Callable<String>(){
            @Override
            public String call() throws Exception{
                System.out.println("print from callable");
                Thread.sleep(3000);
                return "From Callable";
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> futureObject = executorService.submit(c);

        String stringValue = futureObject.get();
        System.out.println(stringValue);
    }
}
