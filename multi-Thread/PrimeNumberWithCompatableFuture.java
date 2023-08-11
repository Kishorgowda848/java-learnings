import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeNumberWithCompatableFuture {
    public static void main(String[] args) {
        
        // ExecutorService executorService = Executors.newFixedThreadPool(5);
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Please Enter the number");
            int value = in.nextInt();
            if(value==0){
                break;
            }else{
                 CompletableFuture.supplyAsync(()->Calculate.isPrimeNumber(value)).thenAccept((n)-> System.out.println(n));// Default common thread pool.
                //  CompletableFuture.supplyAsync(()->Calculate.isPrimeNumber(value),executorService).thenAccept((n)-> System.out.println(n));
                // You can customized thread pool.

             }
    
        }

    }
}

/** Power Full API  */
