package LeetcodeSollutions;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public  void minmaxsum(List<Integer> arr){
     int min = Collections.min(arr);
     int max =   Collections.max(arr);
     int totalSum =0;
     for(int num:arr){
         totalSum += num;
     }

     int minSum = totalSum - max;
     int maxSum = totalSum - min;
        System.out.println(minSum+" "+maxSum);
    }
}

