package chap09.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStackTest03 {

    public void go() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String str = reader.readLine();
        System.out.println(str);
        reader.close();
    }


    public void come() throws IOException {
        //ctrl + alt + t 단축키 중요

        go();
    }

    public static void main(String[] args) {
        try {
            new MethodCallStackTest03().come();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

