package chap11;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Scanner 선언

        Map<String, Integer> map = new Hashtable<>();//Map 선언

        map.put("김열공",80);
        map.put("최고봉",90);
        map.put("우등생",95);
        map.put("나자바",88);//선언한 Map에 4개의 이름과 점수 저장

        System.out.print("이름을 입력하세요 : ");
        String name = in.nextLine();

        System.out.println(map.get(name));//get 함수에 입력받은 name을 넣어 점수 출력
    }
}
