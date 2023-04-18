package chap10.functionalinterfaceapi;

//(3) Supplier Functional Interface => get() method

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest01 {

    public static List<Integer> makeIntegerList(Supplier<Integer> S, int n){//target type List Integer
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(S.get());
        }
        return list;
    }


    public static void main(String[] args) {
        Supplier<Integer> spr = () -> {
            Random random = new Random();
            return random.nextInt(50);//index 사용할 때 0 조심할 것(예외처리 필수)
        };//두 줄 들어갈 거라 Lambda의 {}생략 못해

        List<Integer> list = makeIntegerList(spr, 6);//Supplier spr, 6개 뽑을거니까 6
    }
}
