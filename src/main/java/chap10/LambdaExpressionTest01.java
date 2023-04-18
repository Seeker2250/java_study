package chap10;

/*
1)parameter와 return 값이 없는 Lambda Expression
 */
@FunctionalInterface
interface IctFunctionalInterface{
    public void method();
    //parameter 없는 method
    // abstract생략
}



public class LambdaExpressionTest01 {
    public static void main(String[] args) {
        IctFunctionalInterface fi;//functional Interface라는 이름으로 선언

        //(1) 일반적인 Lambda Expression 사용 방법
        //(parameter도 return값도 없는 Lambda Expression)

        fi = () -> {
            String str = "Lambda Expression Practice 01";
            System.out.println(str);
        };//fi에 결과값 할당, 세미콜론 중요

        fi.method();
        //이게 하나의 pattern grammar
        //세미콜론 statement, SQL문일 때 (Query), Lambda Expression인지 아닌지, Anounymous function일 때
        //함수 기호에 {}가 오는 순간 바로 Lambda Expression


        //(2)위를 줄이는 방법
        //줄임 없이 한 줄로 표현
        fi = () -> { System.out.println("Lambda Expression Practice 02"); };
        fi.method();

        //(3)확 줄이는 방법
        //parameter가 없고 return이 없는 이 경우에
        //{} 내용물만 남기고 없앨 수 있어
        //()이 함수기호는 절대 생략 불가
        fi = () -> System.out.println("Lambda Expression Practice 03");
        fi.method();


    }
}
