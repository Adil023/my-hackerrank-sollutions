package LeetcodeSollutions;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(findThreeSum(arr));
    }

    public static List<List<Integer>> findThreeSum(int[] arr){
        Set<List<Integer>> nums = new HashSet<>();


        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            int sum =  arr[i]+arr[left]+arr[right];
            while(left < right){
               if(sum == 0){
                   nums.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   left++;
                   right--;
               }else if(sum<0){
                   left++;
               }else{
                   right--;
               }
           }

        }
        return new ArrayList<>(nums);
    }
}
