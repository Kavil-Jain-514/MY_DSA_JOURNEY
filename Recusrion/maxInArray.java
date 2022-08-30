package Recusrion;

public class maxInArray {

    public static int maxArr(int[] arr, int index) {
        if(index == arr.length)
            return Integer.MIN_VALUE;
        int myMax = arr[index];
        int recMax = maxArr(arr, index+1);
        return Math.max(myMax, recMax);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,1,6,8,3,9,15};
        int max = maxArr(arr, 0);
        System.out.println(max);
    }
}
