package chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        //q.remove();
        System.out.println(q.poll());
        q.offer("코뿔소");
        System.out.println("지금 고양이가 추가되었나요?" + q.offer("고양이"));

        //Ctrl + Alt + T
        try {
            q.add("강아지");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println("head 엿보기 : "+ q.peek()); // 코뿔소
    }
}
