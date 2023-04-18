package chap06;
//Inheritance 완전 중요!!
//child class와 parent class는 is-a관계(ex : 독수리는 동물이다)
//그런데 has-a관계는 상속이 성립되지 않음.
//그리고 서로 다른 클래스에서 상속받은 member의 이름이 같으면 다중상속이 지원되지 않음
//extends 뒤에는 2개 이상의 parent class가 올 수 없음

//많이 헷갈렸던거 !!!
//parent class에 있는 private method, static method, final method는 child class가 override 할 수 없음
//왜냐!!!
//method는 field와 다르기 때문!

//child class가 method를 override하면 child object는 parent class의 overriding 된 method를 숨김
//이 숨긴 놈을 호출할 때 쓰는 게 super
class Animal{
    //Constructor
    public Animal(String s) {
        System.out.println(s);
    }
}
class Mammal extends Animal {
    public Mammal() {
        super("고양이");
        System.out.println("포유류 : 고양이");
    }

    //Parent Constructor
    public Mammal(String s) {
        super(s);
        System.out.println("");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Mammal cat = new Mammal();
    }
}
