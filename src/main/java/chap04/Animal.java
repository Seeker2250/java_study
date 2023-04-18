package chap04;
//객체지향 시작
//encapsulation, inheritance, polymophism이 중요해
//object를 추상화해줄 때는 상태를 field로, 동작을 method로 해줘야함.
//다양한 것들을 모두 class에 포함하기에는 어렵기 때문에 해주는 것, class는 하나의 설계도와 같은 것
//참고로 interface는 다중상속이 되지만 abstract는 할 수 없음

//getter method, setter method 번역하지마
//encapsulation 잘해야해 해킹 안당하려면
//public으로 두지말자
//적절하게 encapsulation과 decapsulation 해줄 줄 알아야 해
//예시 : 리모콘의 회로는 은닉되어있지만 버튼은 노출되어있음
//getter로 접근, setter로 설정

public class Animal {
    public void move(){
        System.out.println("동물들은 각자의 움직임이 다릅니다.");
    }
    public void sound(){
        System.out.println("동물들은 각자의 소리가 다릅니다.");
    }
}
//parent class는 child class랑 연결
//super class는 sub class랑 연결
//다중 상속은 지원하지 않아(extends 다음 둘 이상의 parent class가 올 수 업음(+)

//constructor는 모든 class에 꼭 하나 이상 들어감
//default constructor는 매개변수도 없고 실행할 내용도 없는 친구지만 있어(new operator로 호출할 수 있음)
