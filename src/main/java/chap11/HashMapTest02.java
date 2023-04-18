package chap11;
//(2)map.keySet() method Practice
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Map의 Generic type이 같으므로 Constructor 부분은 생략 가능
        map.put(1, "사과");
        map.put(1, "바나나");
        map.put(1, "포도");
        map.put(1, "딸기");

        Set<Integer> keySet = map.keySet();
        //keySet method로 모든 key를 Set Collection으로 얻어
        for (Integer key : keySet ) {
            System.out.println(key + " : " + map.get(key));
       }
        //예전에는 Iterator를 통해 key를 하나씩  얻고 get method 사용
        //지금은 그냥 for each 쓰면 돼

    }
}
