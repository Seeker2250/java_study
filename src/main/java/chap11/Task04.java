package chap11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Task04 {
       public static void main(String[] args) {
              Set<String> a1 = new HashSet<>();
              a1.addAll(Arrays.asList("독수리","나비","염소","고양이","개미","여우"));//HashSet생성
              System.out.println("hashset" + a1);//HashSet 확인

              TreeSet<String> a2 = new TreeSet<>(a1);//TreeSet으로 변환
              System.out.println("treeset" + a2);//TreeSet확인

              System.out.println("첫 번째 동물 : "+a2.first());//first 이용 출력
              System.out.println("마지막 동물 : "+a2.last());//last 이용 출력
              System.out.println("나비 앞에 있는 동물 : "+a2.lower("나비"));//lower 이용 출력
       }
}
