package Arrays;

import java.util.*;

public class Arrays_Findnon_Duplicate {
   /*
    Instructions from your teacher:

Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
    */
   public static void main(String[] args) {

       Scanner input=new Scanner(System.in);

       int[] nums={input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

       for(int i=0; i<nums.length; i++){

           int frequency=0;

           for(int each:nums){
               if(each==nums[i]){
                   frequency++;
               }
           }
           if(frequency==1){
               System.out.println(nums[i]);
           }
       }
   }
}
