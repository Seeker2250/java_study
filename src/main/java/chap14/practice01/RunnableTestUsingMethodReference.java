package chap14.practice01;

public class RunnableTestUsingMethodReference {
    public static void main(String[] args) {
        //Instance Method Reference
        new Thread(new RunnableTestUsingMethodReference()::doSomething).start();
    }
//method로 되어있으면 분리할 수 있고 확장에도 용이함
    public void doSomething(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// 571p 참고

//JAVA는 runnig에서 dead로 빠져 나오는 방법이
//과거에는 stop method 였으나 이제는 inturrupt method를 사용한다
//Anonnymous Class가 어떻게 Runnable interface로 변화되었는지,
//method reference type으로도 쓸 수 있는지 등 변환들에 집중
//stream으로 가면 코드가 엄청 줄어들기 때문에~

//window 쓰려면 javaFX쓸 것
//이건 XML로 되어있음

//web은 static type으로 Thymeleaf or Mustache 쓸 것
//둘다 HTML이지만 교수님은 Themeleaf 추천하심
//javascript연계 가능

//JSP도 좋지만 dynamic web이 단점도 있어
//grammar도 간단해

//우리는 gradle이나 yaml 나가서 dock랑 연결