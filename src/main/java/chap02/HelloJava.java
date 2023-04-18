package chap02;

public class HelloJava {
    public static void main (String[] args) {
        System.out.println("Welcome to java World");
        System.out.println("");
    }
}
//JAVA_HOME derectory 설정
//%JAVA_HOME%\bin
//D드라이브에 시스템 환경변수로 만들어서 해야한다
//프로젝트 만들고나서 환경설정
//Ctrl + Alt + S
//Project Structure
//Ctrl + Shift + Alt + S
//psvm : public static void main(String[] args)

//return이 필요없으면 void

//Naming Rules
//File, Class는 PascalCase
//Method, Variable(Field)는 camelCase
//Constants(상수)는 SNAKE_CASE

//var 예약어 초깃값으로 data type 추론 가능, 식별자로 사용할 수 있음
//단, java 10부터 지원

//doble(float(long(int(short,char(byte, 타입범위가 넓은 방향으로 자동 타입 변환
