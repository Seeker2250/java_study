package chap09.generics;
public class GenericsTest {
    public static void main(String[] args) {
        // [1] Generics 사용 안함
        SimpleBox sb = new SimpleBox();
        sb.setObject(1); //promotion,  Integer -> object
        //Integer n1 = sb.getObject(); 이거 오류남. 이유 : object인데 왜 Integer냐 이거임
        Integer n1 = (Integer) sb.getObject(); // Type casting : object -> Integer

        System.out.println(n1);

        sb.setObject("SMU");
        String s1 = (String) sb.getObject();

        System.out.println(s1);

        // [2] Generics 사용할 경우
        Box<Integer> gb = new Box<>(); // Type Inference
        gb.setT(33);
        Integer n2 = gb.getT();

        System.out.println(n2);

        Box<String> gsb = new Box<>();
        gsb.setT("ICT");
        String s2 = gsb.getT();

        System.out.println(s2);

        // [3] Raw Type 사용할 경우, (절대 사용하지 마세요...)
        Box  rawBox = new Box();
        rawBox.setT(22);
        //Integer n3 = rawBox.getT(); 이거 오류남, 마찬가지로 Type casting 문제
        Integer n3 = (Integer) rawBox.getT();

        System.out.println(n3);

    }
}
