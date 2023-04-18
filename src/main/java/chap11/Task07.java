package chap11;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task07 {
    public static void main(String[] args) {
        String[] s1 = {"a","b","a","b","c"};
        String[] s2 = {"c"};

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Collections.addAll(set1,s1);
        Collections.addAll(set2,s2);//Collection의 addAll()을 사용하여 HashSet객체로 생성

        System.out.println("set1 : " +set1);
        System.out.println("set1 : " +set2);//두 HashSet 출력

        System.out.println("set1과 set2는 같다 : " + set1.equals(set2));
        System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));//두 HashSet비교

        Set<String> union = new HashSet<>(set1);
        Set<String> intersection = new HashSet<>(set1); //s1에 의한 HashSet이 s2에 의한 HashSet을 모두 포함하는지 확인

        union.addAll(set2);
        intersection.retainAll(set2);

        System.out.println("합집합 : " + union);
        System.out.println("교집합 : " + intersection);
    }
}
