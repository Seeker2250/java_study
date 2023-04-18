package chap10;


//(3) parameter 2개, return값 없는 경우(void type)

@FunctionalInterface
interface calculator{
    void cal(int a, int b);
        }


public class LambdaExpressionTest03 {
    public static void main(String[] args) {
        calculator c;


        c = (x, y) ->{System.out.println(x + y);};
        c.cal(33, 10);
        c = (x, y) ->{System.out.println(x - y);};
        c.cal(33, 10);
        c = (x, y) ->{System.out.println(x * y);};
        c.cal(33, 10);
        c = (x, y) ->{System.out.println(x / y);};
        //나눗셈은 double이나 float 같은 것으로 해야해 그냥 떨어져

        c.cal(33, 10);
        //하나의  statement일 때는 {}생략
        c = (x, y) ->System.out.println(x + y);

    }
}
