package Recursion;

public class Factorial {
    public static int Fac(int n) {
        if(n==0) {
            return 1;
        }
        return n*Fac(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fac(n));
    }
}
