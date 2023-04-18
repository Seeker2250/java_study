package chap11;
import java.util.HashMap;
import java.util.Map;

public class Task06 {
    public static void main(String[] args) {
        Map<String,String> map1 = Map.of("호랑이","tiger","사자","lion","표범","leopard");
        //Map.of를 이용하여 먼저 값을 입력받음
        Map<String,String> map2 = new HashMap<>(map1);// HashMap으로 옮김

        System.out.println("변경 전 : " + map2);

        map2.replaceAll((k,v)->v.toUpperCase());//문제 조건의 replaceAll()를 사용
        System.out.println("변경 후 : " + map2);
    }
}
