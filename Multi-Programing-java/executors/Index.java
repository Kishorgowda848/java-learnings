import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Index {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0;i<100;i++){
            PrintOneToHundred task = new PrintOneToHundred(i);
            executorService.execute(task);
        }

    }
}
