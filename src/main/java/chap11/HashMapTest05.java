package chap11;
//(5) forEach() method 이용
//단, Java 8 이후
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest05 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(1, "바나나");
        map.put(1, "포도");
        map.put(1, "딸기");
        Set<Integer> keySet = map.keySet();

        //forEach()

        //map.forEach((key, value) -> {System.out.println(key + " : " + value);});

        // BiConsumer로 들어가야해
        //Consumer는 return 없어

        map.forEach((key, value) -> System.out.println(key + " : " + value));

        /*
        1 : 사과
        2 : 바나나
        3 : 포도
        4 : 딸기
         */
    }
}
