package chap10;

/*
(2) parameter one, void type, return값 없음
//argument 하나 있는 거
 */
@FunctionalInterface
interface Printable{
    void print(String s);//string 받을 수 있게
}


public class LambdaExpressionTest02 {
    public static void main(String[] args) {
        Printable p;//Printable p라고 선언

        //(1) 일반적인 Lambda Expression 사용 방법
        p = (String s) -> { System.out.println(s); };
        p.print("Parameter one, return no 01");

        //(2)위를 줄이는 방법
        p = (String s) -> System.out.println(s);
        p.print("Parameter one, return no 02");

        //(3)확 줄이는 방법 parameter type 생략 가능
        //parameter가 하나, return이 없을 때
        p = (s) -> System.out.println(s);
        p.print("Parameter one, return no 03");

        //(4)parameter 하나인 경우에 () 생략 가능
        p = s -> System.out.println(s);
        p.print("Parameter one, return no 04");

    }
}