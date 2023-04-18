package chap06;
//method overriding은 return type과 parameter가 같아야해!
//재정의하는거야
//근데 method overloading은 그냥 중복해서 정의하는 거
class Car {
    public Car(String model){
        System.out.println(model);
    }
}

class SportsCar extends Car{
    public SportsCar(){
        super("Ferarri Sports Car!!!");
    }
}

public class CarTest{
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
    }
}
//constructor는 class member가 아니니까 child class에 상속되진 않음
//단, parent class로부터 물려받은 member가 있을 떄!!
//child class가 이를 initializing하기 위해서 parent class의 construct 필요
