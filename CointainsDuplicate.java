//Problem: Check if an array contains duplicates.

import java.util.*;
public class CointainsDuplicate{
    public static boolean containsDuplicate(int [] nums){
        Set <Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}