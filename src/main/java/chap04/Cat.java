package chap04;

public class Cat extends Animal{

    //Overrriding : CTRL + O

    @Override
    public void move()
    {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void sound()
    {
        System.out.println("고양이가 야옹이라고 웁니다. ~~야옹~~");
    }

    public void catAtti()
    {
        System.out.println("고양이는 그루밍을 하는 특징이 있습니다.");
    }
}
//private method는 parent class 전용이라 child class에 상속 안돼
//static method는 class 소속이므로 child class가 override 할 수 없어
//final method는 더이상 수정될 수 없으므로 child class가 override할 수 없어
