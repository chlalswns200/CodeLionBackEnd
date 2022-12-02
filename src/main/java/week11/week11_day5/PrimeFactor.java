package week11.week11_day5;

public class PrimeFactor {

    static int findPrimeFactor(int n) {
        
        int max = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                if(i>max) max = i;
                n /= i;
            }
        }

        if (n != 1) {
            if(n>max) max = n;
        }
        return max;
    }

    static int primeNum(int n) {

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j==0){
                    check = false;
                }

            }
            if(check){
                System.out.println("i = " + i);
                cnt++;
            }

        }
        return cnt;
    }


    public static void main(String[] args) {

        int primeFactor = findPrimeFactor(13195);
        System.out.println("primeFactor = " + primeFactor);
        //int num = primeNum(7);
        //System.out.println("num = " + num);

    }
}
