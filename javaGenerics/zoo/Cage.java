package zoo;

public class Cage<T extends  Animal & Eat>{

    //multiple upper bounds
    private T animal1;
    private T animal2;

    public Cage(T animal1,T animal2){
      this.animal1 = animal1;
      this.animal2 = animal2;
    }

    public static <T extends Animal & Eat> boolean  isCompatabile(T animal1,T animal2){
       return animal1.eats();
    }

}
