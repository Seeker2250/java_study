package chap11;
//(3) map.values() method Practice
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(1, "바나나");
        map.put(1, "포도");
        map.put(1, "딸기");
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet ) {
            System.out.println(key + " : " + map.get(key));
        }

        Collection<String> values = map.values();
        //values 안에 원하는 타입을 Array로 한 번에 담아내는 것
        System.out.println(values);
        //결과값은 Collection type으로
        //Array니까 index도 있음 따라서 이 성질을 통해 응용 가능
    }
}
