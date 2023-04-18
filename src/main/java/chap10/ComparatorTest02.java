package chap10;

import java.util.Arrays;
import java.util.Comparator;

//parameter가 두 개네 그리고 return은 생략할 수 있네?
//Lambda Expression 기준
public class ComparatorTest02 {
    public static void main(String[] args) {
        String[] strings = {"로마에 가면 로마 법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};

        //Ascending
        Arrays.sort(strings, (first, second) -> first.length() - second.length());

        //Descending
        //Arrays.sort(strings, (first, second) -> second.length() - first.length());

        for (String s: strings) {
            System.out.println(s);
        }


    }
}
