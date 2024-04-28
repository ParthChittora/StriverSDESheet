import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length; //size of the array
        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int j : nums) {
            if (cnt1 == 0 && el2 != j) {
                cnt1 = 1;
                el1 = j;
            } else if (cnt2 == 0 && el1 != j) {
                cnt2 = 1;
                el2 = j;
            } else if (j == el1) cnt1++;
            else if (j == el2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int num : nums) {
            if (num == el1) cnt1++;
            if (num == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
//        List<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int value = map.getOrDefault(nums[i], 0);
//            map.put(nums[i], value + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> el:map.entrySet()
//             ) {
//            if (el.getValue() > (nums.length / 3)) {
//               ans.add(el.getKey());
//            }
//        }
//        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,7,7};
        System.out.println(majorityElement(arr));
    }
}
