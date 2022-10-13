package week1.day5;

class Exployee {
    int salary=0;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Exployee {

    @Override
    public int getSalary() {
        return super.getSalary()+5000000;
    }
}

class Programmer extends Exployee {

    @Override
    public int getSalary() {
        return super.getSalary()+6000000;
    }
}
public class M5 {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자의 월급: " + obj1.getSalary());
        Programmer obj2 = new Programmer();
        System.out.println("프로그래머의 월급:  " + obj2.getSalary());
    }


}
