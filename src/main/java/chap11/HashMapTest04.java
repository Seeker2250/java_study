package chap11;
//(4)Iterator
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//옛날 방식(Iterator 사용하는 방식)
public class HashMapTest04 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "사과");
        map.put(1, "바나나");
        map.put(1, "포도");
        map.put(1, "딸기");

        //Iterator
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entrySet = itr.next();
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

    }
}
