package Test;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Ideone
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            System.out.println("URL을 입력하세요 : ");
            Scanner scan = new Scanner(System.in);
            String url;
            url = scan.nextLine();
            while(true)
            {
                if(url.equals("exit"))
                {break;}
                else if((url.substring(url.length()-3, url.length())).equals("com"))
                {System.out.println(url+"은 'com'으로 끝납니다.");}
                else if(url.contains("ac"))
                {System.out.println(url+"은 ac를 포함합니다.");}

                System.out.println("URL을 입력하세요 : ");
                url = scan.nextLine();
            }
        }
    }
