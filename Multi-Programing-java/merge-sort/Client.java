import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    
    public static void main(String[] args)  throws ExecutionException, InterruptedException {
      List<Integer>  arrayToSort = List.of(1,2,3,48,8,6);
      Sorter task = new Sorter(arrayToSort);
      ExecutorService executorService = Executors.newCachedThreadPool();


     Future<List<Integer>> list = executorService.submit(task);

     System.out.print(list.get().toString());
     System.out.println("Hey Done,...");

    }
}
