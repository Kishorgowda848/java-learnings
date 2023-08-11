package zoo;

public class Monkey extends Animal implements Eat{
    
    public static void set(){
        System.out.println("Fun");
    }

    @Override
    public boolean eats() {
        // TODO Auto-generated method stub
        return true;
   }
}
