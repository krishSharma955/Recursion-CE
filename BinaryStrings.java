package Recursion;

public class BinaryStrings {
    public static void binaryStrings(int n, int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, 0, str+"0");
        if(lastPlace==0) {
            binaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binaryStrings(4, 1, new String(""));
    }
}
//Print all the binary Strings of size n without consecutive 1s.
