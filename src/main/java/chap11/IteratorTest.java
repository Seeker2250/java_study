package chap11;

import javax.swing.plaf.basic.BasicListUI;
import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("다람쥐","개구리","나비","고양이");//spread operator


        Iterator<String> iterator = list.iterator();
        //싹 다 reference data라고 생각해 java는 middle ware니까
        //primitive data 거의 없을거야.
        //metrix에서도 방향이 있어 vector와 scalar의 차이, super set 기억하기
        //집합에서도 vector랑 scalar 다르잖아
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //위 while문을 또 쓰고 싶으면 아래와 같이 해야함.
        //NULL은 data를 binding하지 않았다는 뜻 primitive data의 null과 달라
        iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
