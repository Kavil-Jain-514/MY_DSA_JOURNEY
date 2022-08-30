package Recusrion;

import java.util.ArrayList;
import java.util.List;

public class allOccurence {
    public static void isPresent(int[] arr, int index, int target, List<Integer> ans) {
        if(index==arr.length) {
            return;
        }
        if(arr[index]==target)
            ans.add(index);
        isPresent(arr, index+1, target, ans);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,5,1,4,6,8,6,3,9,6,0};
        int target = 6;
        List<Integer> ans = new ArrayList<>();
        isPresent(arr, 0, target, ans); 
        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println("");
    }
}
