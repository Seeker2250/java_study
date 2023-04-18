package chap11;

import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String[] animals1 = {"사슴", "호랑이", "바다표범", "곰"};

        // [1]
        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "고양이");
        //animals2.add("다람쥐");->error, index 때문이야

        for (String as2: animals2) {
            System.out.print(as2 + " ");
        }

        System.out.println();


        // [2] Length를 기준으로 Accending

        //Arrow Function
        //Lambda Expression의 표기가 Java와 Python에서는 () -> {}
        //근데 Java script에서는 () => {}
        //Annonymous Function, Java Script의 callback Function, 비동기식 통신이 다 이런 식으로 변할거야
        animals2.sort((a, b) -> a.length() - b.length());
        //-값이 나오면 b(뒤에 적힌 값)이 더 크다는 뜻(index번호 생각해)
        // 이 방식을 쓰면 삼항 연산자를 굳이 안써도 돼
        String[] animals3 = animals2.toArray(new String[0]);
        for (int i = 0; i<animals3.length;i++){
            System.out.print(animals3[i] + " ");
        }

        System.out.println();
        // of() factory method로 만들 경우
        //[3] Immutable Data의 의미, 건드릴 수 없는 Data(수정, 추가 등 안돼)
        //set() method 사용 불가
        //forEach() method 쓰자
        List<String> cars = List.of("소나타","그랜저","아반떼","제네시스");//얘네 다 Immutable된거야
        //cars.set(1, "K5");
        //Immutable이니까 위 문장은 당연히 Error 발생
        //Unexpected Object Exception 주의
        cars.forEach( s -> System.out.print(s + " ") );
        //같은 기능을 지닌 코드인데 양이 달라
        //이게 제일 짧다는 게 중요(날려버리기로 코드 축약)
        //Exception Handling중요


        //method chaining으로 확장될거야
        //forEach의 parameter는 Consumer, 그래서 Lambda Expreesion 써
    }
}
