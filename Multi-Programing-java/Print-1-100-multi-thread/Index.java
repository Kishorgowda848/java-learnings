
class Index {
    
    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            PrintOneToHundred print = new PrintOneToHundred(i);

            Thread thread = new Thread(print);
    
            thread.start();        
    
        }
        
    }
}
