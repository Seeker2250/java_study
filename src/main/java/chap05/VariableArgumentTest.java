package chap05;


public class VariableArgumentTest {

    //sumFirstExcept() 이 Method 작성이 시험
    static int sumFirstExcept(int i, int... vars){
        int total = 0;
        for (int v: vars) {
            total += v;
            //v는 object
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstExcept(1, 2,3,4));
        int arr[] = {2, 3};
        System.out.println(sumFirstExcept(1, arr));
        System.out.println(sumFirstExcept(1, 2,3,4,5));
    }
}
