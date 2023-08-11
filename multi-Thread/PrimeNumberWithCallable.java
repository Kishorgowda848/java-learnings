import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumberWithCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        List<Future<Integer>> resultlist = new ArrayList<>();
        
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter the number");
            int value = in.nextInt();
            if(value==0){
                break;
            }else{
                Callable<Integer> c = new Callable<Integer>() {
                    @Override
                    public Integer call(){
                       return Calculate.isPrimeNumber(value);
                    }
                };
                Future<Integer> i = executorService.submit(c);
                resultlist.add(i);

                Iterator<Future<Integer>>  itr = resultlist.iterator();

                while(itr.hasNext()){
                    if(itr.next().isDone()){
                        System.out.println("Results-- "+itr.next().get());
                        itr.remove();
                    }
                }
                // System.out.println("Results - "+results);
             }
    
        }

    }

}
