public class KadaneAlgoMaxSubarray {
    public static int maxSubArray(int[] nums) {
        // O(n)
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //currentSum is initialized to 0. This variable will keep track of the sum of the current subarray.
        //maxSum is initialized to Integer.MIN_VALUE. This variable will keep track of the maximum subarray sum found so far.
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            //The code enters a loop that iterates through each element in the nums array.
            //For each element, the currentSum is updated by adding the current element nums[i] to it.
            // This effectively keeps a running sum of the current subarray.
            if (currentSum > maxSum) {
                maxSum=currentSum;
                //Inside the loop, the code checks if the current currentSum is greater than the current maxSum.
                //If it is, the maxSum is updated to the value of the currentSum.
                // This ensures that maxSum always holds the maximum subarray sum found so far.
            }if (currentSum < 0) {
                currentSum = 0;
            }
            //he code then checks if the currentSum is less than 0.
            //If it is, the currentSum is reset to 0.
            // This is because if the current sum becomes negative, it is no longer beneficial to continue adding elements to the current subarray.
            // Instead, we start a new subarray from the next element.
        }
        return maxSum;
        // o(n2)
//        int maxSum=Integer.MIN_VALUE;
//        for (int i = 0; i <nums.length; i++) {
//            int sum = 0;
//            for (int j =i; j <nums.length ; j++) {
//                sum+=nums[j];
//                if(sum>maxSum){
//                    maxSum=sum;
//                }
//            }
//        }return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }
}
