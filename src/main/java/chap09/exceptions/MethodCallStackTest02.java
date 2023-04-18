package chap09.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStackTest02 {

    public void go() throws IOException{
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String str = reader.readLine();
            System.out.println(str);
            reader.close();
    }


    public void come(){
        //ctrl + alt + t
        try {
            go();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//Exception Handing 중요해
    public static void main(String[] args) {
        new MethodCallStackTest02().come();
    }
}

