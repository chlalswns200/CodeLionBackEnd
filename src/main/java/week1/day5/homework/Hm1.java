package week1.day5.homework;

class Employee {

    private String name;
    private int age;
    private String address;
    private String part;
    private int salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPart() {
        return part;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age, String address, String part) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.part = part;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("주소 = " + address);
        System.out.println("부서 = " + part);
    }

}

class Temporary extends Employee{

    final int initSalary = 10000;
    private int workHours;
    private int salaryTime;

    public void setSalaryTime(int salaryTime) {
        this.salaryTime = salaryTime;
    }


    public Temporary(String name, int age, String address, String part) {
        super(name, age, address, part);
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
        this.setSalaryTime(workHours*initSalary);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("비 정규직");
        System.out.println("일한 시간 = " + workHours);
        System.out.println("급여 = " + salaryTime);
    }


}

class Regular extends Employee {

    public Regular(String name, int age, String address, String part) {
        super(name, age, address, part);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("정규직");
        System.out.println("월급 : " + super.getSalary());
    }
}

public class Hm1 {
    public static void main(String[] args) {

        Regular r = new Regular("이순신", 35, "서울", "인사부");
        Temporary t = new Temporary("장보고", 25, "인천", "경리부");

        r.setSalary(5000000);
        r.printInfo();

        t.setWorkHours(120);
        t.printInfo();

    }

}
