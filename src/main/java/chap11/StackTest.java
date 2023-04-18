package chap11;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("코뿔소");
        st1.push("고양이");
        st1.push("강아지");

        System.out.println(st1.peek());
        //강아지

        System.out.println(st1.pop());
        System.out.println(st1.peek());
        //고양이
    }
}
