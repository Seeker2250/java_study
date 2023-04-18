package chap04;

public class PolymorphismTest01 {
    public static void main(String[] args) {

//        Animal animal = new Animal();
        //instance 생성. reference veriable, object 만든 것
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Tiger tiger = new Tiger();
        //object는 소문자로 써
        //Memory map 그려봐
        //다른 주소값으로 계속 만들어내(cat, dog, tiger 전부)
        //하나로 묶어버리면 되는데 굳이 하나하나 따로 만드는 느낌
        //교수님 예시 : 고양이 동물원, 강아지 동물원, 호랑이 동물원 따로따로
        //하나에 다 만드는 게 현실적이고 효율적인 것
        //따라서 Polymorphism이 필요
    //Upcasting
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        //Animal에 cat, dog, tiger를 보내버리는 것

        //Downcasting
//      Cat tmp = cat;는 에러 나(타입이 안맞아, Animal에 있는 애)
//      이와 같이 downcasting은 조심해서 써야 해
        Cat tmp = (Cat) cat;
//        JDK 1.4까지 힘들었음

        System.out.println(cat);
        System.out.println(tmp);

//       위 둘이 같은 주소값인 게 중요, object를 찍으니까 hash code로 나오는 게 별로
//       Memory Address입니다!
//       to String을 쓰자 나중에~
//       우린 나중에 다 reference variable 쓸 거야 그러니 call by reference를 쓰자
//        해봐야 call by address인데 다들 reference variable쓰니까
//        memory, heap area 다루자

        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Cat);//Reference Variable, object

        cat.move();
        dog.move();
        tiger.move();
        //subscription rule이용한 것
        //access modifier가 같은 package에 있어서 가능한 것
        //다른 package에 있으면 문제가 생겨
        //책에는 class 하나 안에 다 넣었지만
        //교수님이 class별로 분리하신 건 stategy pattern때문일 것으로 추측

//        cat.catAtti();는 에러
//        dog.dogAtti();도 에러
//        tiger.tigerAtti();도 에러

//
    }
}
