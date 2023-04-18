package chap10.functionalinterfaceapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//(1)Prediacate Functional Interface => test() method 사용
public class PredicateTest01 {

    static int sum(Predicate<Integer> p, List<Integer> lst){
        int i = 0;
        for (int n : lst) {//list니까 array여서 forEach사용 가능
            if(p.test(n)){
                i += n;
            }//out of if
        }//out of foreach
        return i;
    }//out of static int sum()

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        //primitive data들이 List Collection type으로 바뀌어
        int i;
        i = sum(n -> n % 2 == 0, list);
        System.out.println("짝수의 합 : " + i);

        i = sum(n -> n % 2 != 0, list);
        System.out.println("홀수의 합 : " + i);
    }
}
