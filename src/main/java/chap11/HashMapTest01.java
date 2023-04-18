package chap11;

import java.util.HashMap;
import java.util.Map;

//(1)map.entrySet()
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 2, "딸기", 1);

        Map<String, Integer> fruits = new HashMap<>(map);
        fruits.put("귤", 2);

        //
        for (Map.Entry<String, Integer> entrySet: fruits.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }
}
