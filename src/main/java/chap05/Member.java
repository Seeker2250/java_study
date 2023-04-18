package chap05;

public class Member {
    private int id;
    private String name;
    private String password;
    private int age;
//    얘네를 DTO로 만들거야

    //Alt + insert -> getter

    //    getter and setter
// 223p parent class의 member access 예시
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //왜 this.id일까 set은 return값이 없어 void
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Member(int id, String name, String password, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public Member() {
        super();
    }
//    default construct

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

