package chap10.functionalinterfaceapi;

//(4) Function Functional Interface => Apply method()

import java.util.function.Function;


public class FunctionTest01 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();//return Integer

        //                  12345678
        System.out.println("세명대학교 학생");
        System.out.println("ICT");
    }
}
