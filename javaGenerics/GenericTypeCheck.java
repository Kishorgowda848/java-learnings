import java.util.ArrayList;
import java.util.List;

public class GenericTypeCheck {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hey Kishore");

       System.out.println(names);

       addTonames(names,30);

      //  System.out.println(names);
    }

    private static void addTonames(List names,Integer value){
      names.add(value);
    }
}
