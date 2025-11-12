public class MissingNumber{
    public static int missingNumber(int[] nums){
        int res =nums.length;
        for(int i = 0;i<nums.length-1;i++){
            res ^= i^nums[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        
        System.out.println("Missing number in [3,0,1]: " + missingNumber(nums1)); // 2
        System.out.println("Missing number in [0,1]: " + missingNumber(nums2));   // 2
        System.out.println("Missing number in [9,6,4,2,3,5,7,0,1]: " + missingNumber(nums3)); // 8
    }
}