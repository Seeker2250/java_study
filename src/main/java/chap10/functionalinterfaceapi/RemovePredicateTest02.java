package chap10.functionalinterfaceapi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemovePredicateTest02 {


    public static void main(String[] args) {
        //Integer
        List<Integer> lsi = Arrays.asList(1, -2, 3, -4, 5);
        lsi = new ArrayList<>(lsi);

        //Double
        //List<Double> lsd = Arrays.asList(-5.7, 12, -4.7);
        //lsd = new ArrayList<>(lsd);

        Predicate<Number> p = n -> n.doubleValue() < 0.0;//target type reference variable
        lsi.removeIf(p);
        //lsd.removeIf(p);

        System.out.println(lsi); // {1, 3, 5}
        //System.out.println(lsd); // {1, 3, 5}
    }
}
