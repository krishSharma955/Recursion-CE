package Recursion;

public class PrintIncNum {
    public static void IncNum(int n) {
        if(n==10) {
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        IncNum(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        IncNum(n);
    }
}
