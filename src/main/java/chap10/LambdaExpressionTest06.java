package chap10;

import java.lang.reflect.Type;

//(6)제일 중요함 1-5번 test 다 Generic interface type으로
//값이 정해져있지 않은 형태로
//이제 어떤 값이 들어오더라도 그때 memory에 딱 compile 되는거야
//Generic interface
//Generic parameter, Generic return type인 경우
//이게 실제 객체지향인 것
@FunctionalInterface
interface Calculator03<T>{
    T cal(T a, T b);
}

public class LambdaExpressionTest06 {
    public static void main(String[] args) {

        Calculator03 <Integer> c3 = (x, y) -> x + y;
        System.out.println(c3.cal(3, 3));

        Calculator03 <Double> cd = (x, y) -> x + y;
        System.out.println(cd.cal(3.33, 3.45));
    }
}
//Comparable interface로 object 정렬하면 안되는 경우
//(1)
//Comparable interface는 object끼리 비교할 기준이 여러가지 있을 경우
//싸그리 override 해줘야 해서 코드가 복잡해짐
//(2)
//비교할 기준을 포함한 class가 final class인 경우(inheritance 못하는 경우)
//Comparable 구현 클래스를 정의할 수 없음

//자세한건 ComparatorTest Class에서 확인
