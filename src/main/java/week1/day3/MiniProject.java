package week1.day3;

public class MiniProject {
    public static class Student {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCode() {
            return code;
        }

        public void setCode(Long code) {
            this.code = code;
        }

        public Long getAge() {
            return age;
        }

        public void setAge(Long age) {
            this.age = age;
        }

        String name;
        Long code;
        Long age;

    }
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Kim");
        student1.setCode(20180001L);
        student1.setAge(20L);

        System.out.println("student1.name = " + student1.getName());
        System.out.println("student1.name = " + student1.getCode());
        System.out.println("student1.name = " + student1.getAge());

    }
}
