package chap09.exceptions;
//exception handling 아주 중요해
//대표적인 방법이 try catch문
//이거 그냥 적지말고 Ctrl Alt T 누르면 선택 가능
//잡아서 처리하는 게 아니라 그냥 던질 때는 throws 사용
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStackTest {

    public void go(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String str = reader.readLine();
            System.out.println(str);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void come(){
        go();
    }

    public static void main(String[] args) {
        new MethodCallStackTest().come();
    }
}

