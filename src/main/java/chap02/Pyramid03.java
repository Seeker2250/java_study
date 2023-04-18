package chap02;
//Primitive data는 최대한 빠르게 다루고 object로 넘어가야한다
//constant는 항상 동일한 값을 가지는 애, literal은 program에서 정의한 값
//따라서 literal의 이름을 직관적으로 부여해서 가독성을 올릴 수 있음
//operator의 우선순위는 단항, 이항, 삼항 순
//이항은 산술 비교 비트 논리 대입 순이지만 priority를 다르게 해줄 수 있어

public class Pyramid03 {
    public static void main(String[] args) {
        int i, j, k;
        int num = 5;

        for (i = 0; i < num; i++) {
            for (j = 0; j < num - i; j++) {
                System.out.print(" ");
            }//j

            for (k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
