package chap09.generics;
import java.util.List;
//generic도 중요해!!
//수학도 일반화식을 추출해야 규칙을 말하고 그래프를 그릴 수 있듯
//generic은 너무나도 중요한 것

public class Box <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
