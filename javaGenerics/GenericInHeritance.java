import java.util.ArrayList;
import java.util.List;

public class GenericInHeritance {
    public static void main(String[] args) {
        
        List<Integer> integer = new ArrayList<>();
        integer.add(90);
        integer.add(9);
        printValue(integer);

        List<Double> doubles = new ArrayList<>();
        doubles.add(9.90);
        printValue(doubles);

        List<Number> num = new ArrayList<>();
        addValue(num, 10.90);
        printValue(num);

    }

    private static void addValue(List<? super Number> numbers,Number number){
     numbers.add(number);
    }

    private static void printValue(List<? extends Number> numbers){
        //Upper Bound 
        numbers.forEach(System.out::println);
    }
}
