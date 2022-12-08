package week12;

public class FiboDp {



    public static void main(String[] args) {

        int n=5;
        long a = fibDp(5,new long[n+1]);
        System.out.println("a = " + a);
    }

    private static long fibDp(int n, long[] memo) {
        if(n==0) throw new IllegalArgumentException("n은 1 이상이어야 합니다.");
        if(n<=2) return 1;
        if (memo[n] == 0) {
            memo[n] = fibDp(n - 1, memo) + fibDp(n - 2, memo);
        }
        return memo[n];
    }
}
