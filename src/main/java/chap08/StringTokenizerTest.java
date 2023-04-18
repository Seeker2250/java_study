package chap08;
//utility class와 interface를 원한다면 java.util package 사용
//아래 예시 참고
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "of the people@by the people@for the people";

        StringTokenizer st = new StringTokenizer(str, "@");
        System.out.println(st.countTokens());

        while (st.hasMoreTokens()){
            System.out.print("[" + st.nextToken() + "]");
        }
    }
}
//이 외에도 java.text package 등 존재