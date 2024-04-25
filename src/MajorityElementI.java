public class MajorityElementI {
    public static int majorityElement(int[] nums) {
        return helper(nums, 0, nums[0]);
    }
    // Since there is an element that will occur more than n/2 times so if we maintain
    // count for every element and if we subtract 1 every time that el is not found
    // still then count>0
    public static int helper(int[] nums, int si, int ref) {
        int c = 0;
        for(int i = si; i < nums.length; i++) {
            if(nums[i]==ref)
                c++;
            else
                c--;
            // if c==-1 it means that the numbers till now are not the max occuring el
            if(c == -1)
                return helper(nums,i,nums[i]);
        }
        return ref;
    }
    public static void main(String[] args) {
        int[] arr= {2,2,2,1,1,1,1,2,2,};
        System.out.println(majorityElement(arr));
    }
}
