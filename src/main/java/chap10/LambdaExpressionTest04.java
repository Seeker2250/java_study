package chap10;

//(4)parameter가 1개 있고, return type이 있는 경우

@FunctionalInterface
interface LengthCount{
    int len(String s); //parameter가 하나(String)
}
public class LambdaExpressionTest04 {
    public static void main(String[] args) {
        LengthCount lc;

        //()생략 가능
        lc = s -> s.length();
        System.out.println(lc.len("이게 작동될까요? 그렇다면 몇 글자일까요?"));
    }
}
