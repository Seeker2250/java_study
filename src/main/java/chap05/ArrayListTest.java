package chap05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        //reference type, variable 필요, 우측 소괄호 안 Integer생략(같으니까)
        //Generic이야 ArrayList도
        //Alt + enter = interface type으로 바꾸기
        //Interface의 구현객체는 Interface 타입에 대입하여 자동으로 Interface타입으로 변환돼
        //Interface의 타입 변수로 Interface 멤버만 볼 수 있게 묶는 것도 가능
        //override 되어있는 것만 reference할 수도 있어
        //구현 클래스에서 추가된 멤버에 접근하려면 강제로 casting 해야해
        int data;
        int sum = 0;

        while((data = scanner.nextInt()) >= 0) {
            scores.add(data);
        }
        //내가 -type 나올 때까지 primitive data 담을거다

        for (int i = 0; i < scores.size(); i++) {
            //sum = sum + scores.get(i);
            sum += scores.get(i);
        }
        //array때는 length 썼지만 여기서는 size, arraylist라서 그래
        System.out.println("평균 : " + (double)sum/scores.size());
    }
}

