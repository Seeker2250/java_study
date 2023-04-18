package chap08;

public class StringBuilderTest {
    public static void main(String[] args) {
        // [1] String + operator 사용
        String str = new String("정보통신학부");
        //System.out.println(str);
        System.out.println(str.hashCode());

        //str +="화이팅!!";
        str = str + "화이팅!!";

        System.out.println(str.hashCode());

        System.out.println("-------------------");

        //[2] stringBuilder append());사용

        StringBuilder sb = new StringBuilder("정보통신학부");
        System.out.println(sb.hashCode());

        sb = sb.append("화이팅!!");
        System.out.println(sb.hashCode());
    }
    //append를 활용한 위 둘은 똑같아 (Hashcode가 같아)
    //StringBuilder 장점
}

