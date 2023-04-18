package chap11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Person {//Person 클래스 정의
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name= name;
        this.age = age;
    }
    @Override
    public String toString() {//toString 오버라이딩
        return  name + " : " + age;
    }
}
public class Task02 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        set.add(new Person("김열공",20));
        set.add(new Person("최고봉",56));
        set.add(new Person("우등생",16));
        set.add(new Person("나자바",35));

        Iterator<Person> iter = set.iterator();//Iterator  선언
        while(iter.hasNext())
            System.out.println(iter.next());//Iteratior를 사용하여 값 출력

        for(Person p : set)
            System.out.print("Person["+p+"] ");
    }
}
