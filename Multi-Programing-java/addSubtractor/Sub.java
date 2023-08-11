public class Sub implements Runnable {

    private Count count;

    public Sub(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
       
        for(int i=1;i<10000;i++){
            this.count.value -=i;
        }
    }

}
