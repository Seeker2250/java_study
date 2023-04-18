package chap08;
//package!!
//가장 기본이 되는 건 java.lang package!
//import문 없이 가능한 package!

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 5; i++){
            System.out.println(r.nextInt(100) + " ");
        }
    }
}
