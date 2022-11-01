package week7.week7_day2;

public class TemplateCallbackPrime {

    interface StatementStrategy {
        boolean compare(int a, int b);
    }

    boolean someOperation(int a,int b) {
        return a < b;
    }

    boolean isPrime1(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i,num); i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        tcp.isPrime1(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a*a<=b;
            }
        });
        System.out.println(tcp.isPrime1(13, (a, b)-> a < b));
        System.out.println(tcp.isPrime1(17, (a, b)-> a < b/2));
        System.out.println(tcp.isPrime1(19, (a, b)-> a * a < b));
    }
}
