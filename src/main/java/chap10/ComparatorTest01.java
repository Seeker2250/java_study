package chap10;
//java lang package에 있는 Comparable interface의 경우 사용하지 말 것, 사유는 아래 기재
//1)object끼리 비교할 기준이 여러 개일 때 계속해서 재정의해야함
//2)final인 경우에 inheritance 못함
import java.util.Arrays;
import java.util.Comparator;

//옛날 방식으로 작성할거야
//01 이후로는 Lambda Expression으로 해줄거야
//Ascending과 Descending
public class ComparatorTest01 {
    public static void main(String[] args) {
        String[] strings = {"로마에 가면 로마 법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다."};

        Arrays.sort(strings, new Comparator<String>() {
            // Arrays.sort(strings, new Com하는 순간 다 패턴화 돼서 IntelliJ가 해줌
            @Override
            public int compare(String first, String second) {
                //Ascending
                //return first.length() - second.length(); 이거 comment 풀고 Descending comment 하면 다시 Ascending

                //Descending
                return second.length() - first.length();
            }
        });//다 Anonymous object가 되는 거 함수명이 없음 call back 다 이런 형태
        //Anonymous function인 게 포인트 Anonymous 구현인 거 꼭 알아두어야 해

        //for (type 아무 이름 : 변수){
        //}
        for (String s: strings) {
            System.out.println(s);
        }
        //반드시 String으로 연습 (primitive는 현실성이 없어 다 object type 이어야 해
        //Business logic을 위해서라도!!!

        //Algorithm은 만드는 것보다 천재들이 만든 걸 가져다 쓰는 게 훨씬 낫다.
        //면접 때나 잠깐 무식하게 하는 용도로 써먹고 현업에서는 필요없음
    }
}
