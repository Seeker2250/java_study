package chap10.functionalinterfaceapi;

//(5) Operator Functional Interface => apply() method (API document 참고)
//이 중 sample을 DoubleUnaryOperator로 사용

import java.util.function.DoubleUnaryOperator;
//functional interface지만 원하는 reference variable을 만드는 것
public class OperatorTest01 {
    public static void main(String[] args) {
        DoubleUnaryOperator cti = d -> d  * 0.393701;//cm to inch
        DoubleUnaryOperator itc = d -> d * 2.54;//inch to cm

        System.out.println("30 inch는 "+ itc.applyAsDouble(30.0)+"cm 입니다.");
        System.out.println("76.2cm는 "+ cti.applyAsDouble(76.2)+"inch 입니다.");
    }
}
