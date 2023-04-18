package chap11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args) {
    Set<Fruit> fruits = new HashSet<>();
    fruits.add(new Fruit("사과"));
    fruits.add(new Fruit("사과"));

        System.out.println(fruits.size());
        System.out.println(fruits);

        //[1] HashCode()와 equals() method가 없는 경우
        //[Fruit[name = '사과'][, Fruit [name = '사과']]



        //[2] HashCode()와 equals() method가 있는 경우
        //[Fruit[name = '사과]]
    }


    static class Fruit {
        String name;
        // Alt + Inset
        //[1]
        public Fruit(String name) {
            this.name = name;
        }
        //가장 중요한 포인트!!!
        // hashcode와 equals method는 항상 같이 다녀야함
        //[2]
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fruit fruit = (Fruit) o;
            return Objects.equals(name, fruit.name);

         }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }


        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
