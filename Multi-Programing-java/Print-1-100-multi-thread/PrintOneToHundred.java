public class PrintOneToHundred implements Runnable {

    int number;
    
    public PrintOneToHundred(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread by "+ Thread.currentThread().getName() +"  : Number :-"+ this.number);
    }
    
}
