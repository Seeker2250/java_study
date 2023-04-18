package chap11;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "포도", "수박"};
        Set<String> hs1 = new HashSet<>();
        Set<String> hs2 = new HashSet<>();

        for (String s :fruits) {
            hs1.add(s);
        }
        System.out.println("1단계 : " + hs1);
        //1단계 : 포도 수박 사과 바나나
    }
}
