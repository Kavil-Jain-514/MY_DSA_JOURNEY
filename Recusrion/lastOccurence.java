package Recusrion;

public class lastOccurence {
    public static int isPresent(int[] arr, int index, int target) {
        if(index==arr.length) {
            return -1;
        }
        if(arr[index]==target){
            return index;
        } else {
            return isPresent(arr, index-1, target);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,1,4,6,8,6,3,9,6,0};
        int target = 3;
        int ans = isPresent(arr, arr.length-1, target);
        if(ans == -1)
            System.out.println("Not Found");
        else   
            System.out.println(ans);  
    }
}
