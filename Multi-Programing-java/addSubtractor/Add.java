public class Add implements Runnable {

    private Count count;

    public Add(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<10000;i++){
            this.count.value += i;
        }
    }
    

}
