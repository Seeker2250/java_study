package chap11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        int input,max;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<Integer>();
//점수를 1번 이상 받아야 하기 때문에 do while문을 사용
        do {
            System.out.print("점수를 입력하세요 : ");
            input = in.nextInt();
            if(input>=0) score.add(input);
        } while(input>=0);
        //음수를 받기 전까지 반복

        System.out.println("전체 학생은 "+score.size()+"명이다.");
        System.out.print("학생들의 성적 : ");
        for (int s : score)
            System.out.print(s + " ");
        System.out.println();
        max=Collections.max(score);
        //collections에 있는 max()로 입력받음
        //score 점수 중에서 가장 높은 값을 max라는 변수에 따로 저장

        Task05 check = new Task05();

        for(int i=0;i<score.size();i++) {
            System.out.println(i+"번 학생의 성적은 "+score.get(i)+"점이며 등급은"+check.rating(score.get(i),max)+"이다.");
        }//만든 rating method를 for문안에서 score.size()만큼 돌려주어 원하는 값을 출력
    }

    public String rating(int score,int max) {//등급을 매겨주는 rating 이라는 method  따로 제작
        if(score>=max-10)
            return "A";
        else if(score<max-10 && score>=max-20)
            return "B";
        else if(score<max-20 && score>=max-30)
            return "C";
        else if(score<max-30 && score>=max-40)
            return "D";
        else return "F";
    }
}
