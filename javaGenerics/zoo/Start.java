package zoo;

public class Start {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(),new Monkey());
        Cage<Lion> cage2 = new Cage<Lion>(new Lion(),new Lion());

    }
}
