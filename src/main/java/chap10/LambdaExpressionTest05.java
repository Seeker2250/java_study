package chap10;

//(5)parameter 2개, return type이 있는 경우
//test03과 비교해보면 얼마나 단축되는지 실감 날 것
@FunctionalInterface
interface Calculator02{
    int cal(int a, int b);
}
public class LambdaExpressionTest05 {
    public static void main(String[] args) {
        Calculator02 c2;

        //parameter 2개라 생략 안돼
        c2 = (x, y) -> { return x + y; };
        System.out.println(c2.cal(6, 3));

        //return 1개일 때 {};와 return이라는 keyword는 생략 가능
        c2 = (x, y) -> x + y;
        System.out.println(c2.cal(6, 3));
    }
}
