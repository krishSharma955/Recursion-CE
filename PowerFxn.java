package Recursion;

public class PowerFxn {
    public static int power(int a, int n) {
        if(n==0) {
            return 1;
        }
        int halfPow = power(a, n/2);
        if(n%2!=0) {
            return a*halfPow*halfPow;
        }
        return halfPow*halfPow;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
