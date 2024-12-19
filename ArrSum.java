package Recursion;

public class ArrSum {
    public static int sumArr(int arr[], int i, int sum) {
        if(i==arr.length-1) {
            return arr[i];
        }
        sum += arr[i];
        sumArr(arr, i+1, sum);
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int sum = 0;
        System.out.println(sumArr(arr,i,sum));
    }
}
