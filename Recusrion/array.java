package Recusrion;

public class array {
    
    public static void printArr(int[] arr, int n, int index) {
        if(index==n)
            return;
        printArr(arr, n, index+1);
        System.out.println(arr[index]);
    }
    
    public static void printArr2(int[] arr, int n) {
        if(n==0)
            return;
        System.out.println(arr[0]);
        printArr2(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,1,6,8,3,9,0};
        int n = arr.length;
        printArr(arr, n, 0);
        printArr2(arr, n);
    }
}
