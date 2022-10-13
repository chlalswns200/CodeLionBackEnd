package week2.day8;

class Student {
    private String name;
    private String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "이름은 " + name + "이고 성별은 " + gender + "입니다";
    }
}

public class ObjStringTest {
    public static void main(String[] args) {
        Student s = new Student("홍길동", "남자");
        System.out.println(s);

    }
}
