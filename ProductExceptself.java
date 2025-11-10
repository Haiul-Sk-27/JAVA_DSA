//Problem: Return an array where each element is the product of all other elements. 

public class ProductExceptself{
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        
        int prefix = 1;
        for(int i = 0;i<n;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        int sufix = 1;
        for(int i = n-1;i>=0;i--){
            result[i] *= sufix;
            sufix*=nums[i];
        }
        
        return result;
    } 
    
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}