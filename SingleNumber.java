public class SingleNumber{
    public static int singleNumber(int[] nums){
        int res = 0;
        for(int n : nums){
            res^=n;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in [2,2,1]: " + singleNumber(nums1)); 
        System.out.println("Single number in [4,1,2,1,2]: " + singleNumber(nums2));
        System.out.println("Single number in [1]: " + singleNumber(nums3));
    }
}