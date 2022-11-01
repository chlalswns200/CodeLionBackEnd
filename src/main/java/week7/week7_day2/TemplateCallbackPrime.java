package week7.week7_day2;

public class TemplateCallbackPrime {

    interface StatementStrategy {
        boolean compare(int a, int b);
    }

    boolean someOperation(int a,int b) {
        return a < b;
    }

    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i,num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    boolean isPrime2(int num) {
        for (int i = 2; i < num/2; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    boolean isPrime3(int num) {
        for (int i = 2; i*i <= num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13));
    }
}
