package chap04;

public class PolymorphismTest02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        Animal[] animals = new Animal[]{ cat, dog, tiger };
//        Animal 배열 잘 살펴 Naming rule도
//        animal's' 복수로 나오는 거 중요

//        (1) for
//            for (int i = 0; i < animals.length; i++) {
//            animals[i].move();
//        }
//        (2) 개선된, 향상된 for, 반드시 object를 가지고 있어야 해 array같이 만들어졌을 때
        for (Animal ict02a : animals) {
            ict02a.move();
            ict02a.sound();
        }
    }
}
//this는 constructor에 읭해 생성된 object 자기자신을 가리킴
//그래서 잘 사용하면 이름이 같아도 member field와 매개변수를 구분할 수 있음
//static keyword를 통해 class의 field를 공유할 수 있음(static variable, class variable)
//static으로 지정되지 않은 경우에는 공유되지 않고 instance마다 자신의 field를 생성
//위의 경우를 instance variable이라고 함