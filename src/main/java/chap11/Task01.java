package chap11;
import java.util.ArrayList;
public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();//ArrayList 선언

        animal.add("갈매기");//add()로 동물 추가
        animal.add("나비");
        animal.add("다람쥐");
        animal.add("라마");

        for(String animals : animal)//for-each문과 if 조건문으로 length가 2인 동물만 출력
            if(animals.length()==2)
                System.out.println(animals);
    }
}
