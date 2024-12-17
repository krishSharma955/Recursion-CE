package Recursion;

public class SortedArr {
    public static boolean sortedArr(int arr[], int n) {
        if(n==arr.length-1) {
            return true;
        }
        else if(arr[n]>arr[n+1]) {
            return false;
        }
        return sortedArr(arr, n+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 0;
        System.out.println(sortedArr(arr, n));
    }
}
