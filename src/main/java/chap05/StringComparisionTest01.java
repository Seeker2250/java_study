package chap05;
//import java.lang.*;
//유일한 생략
public class StringComparisionTest01 {
    public static void main(String[] args) {


        String s1 = "Hello ICT";
        String s2 = "Hello ICT";
        String s3 = new String("Hello ICT");

        System.out.println("s1 == s2 : " + (s1 + s2));
        System.out.println("s1 == s3 : " + (s1 + s3));

        //Assignment Operator
        s1=s3;
        System.out.println("s1 == s3 : " + (s1 + s3));

    }
}
//java는 string literal를 내부적으로 string object로 처리함
//그래서 string object를 생성하면 string class의 construct를 호출
//만약 value가 같다면 새로운 string object를 생성하지 않고 기존 literal을 공유함
//내가 실수했던 부분!!! -> 두 개의 string의 value를 비교할 때는 ==나 !=같은 operator를 사용하면 안돼
//위의 경우는 단순히 동일한 object인지만 확인함