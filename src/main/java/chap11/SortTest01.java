package chap11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest01 {
    public static void main(String[] args) {
        String[] fruits = {"포도", "수박", "사과", "키위", "망고"};

        List<String> list = Arrays.asList(fruits);
        System.out.println(list);
        //포도 수박 사과 키위 망고 순서

        //2)
        Collections.reverse(list);
        System.out.println(list);
        //위 순서에서 reverse 되어
        //망코 키위 사과 수박 포도 순서

        //(3)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        //뒤에 있는 값이 통째로 list Collection에 들어가
        //1번에서 reverse order시켜
        //포도 키위 수박 사과 망고 순서
        //가나다라마바사아자차카타파하


        //binarySearch method는 사용하기 전에 반드시 list를 sort해야해
        //sort 안하면 잘못된 값이 나와
        //그리고 binarySearch의 return은 무조건 index로 이루어짐
    }
}
