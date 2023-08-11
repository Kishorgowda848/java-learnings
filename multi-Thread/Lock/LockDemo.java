import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable{
    private Integer i =20;
    private int value = 0;
    private Lock l = new ReentrantLock();

    @Override
    public void run() {
            l.lock();
            try{
                this.increment();
                System.out.println(Thread.currentThread().getName()+" Increments "+this.getValue());
                this.decrement();
                System.out.println(Thread.currentThread().getName()+" Decrements "+this.getValue());
            }finally{
                l.unlock();
            }
    }

    public void increment(){
    this.value++;
    }

    public void decrement(){
    this.value--;
    }

    public int getValue(){
        return  this.value;
    }
}
