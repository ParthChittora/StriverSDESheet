import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> el:map.entrySet()
             ) {
            if (el.getValue() > (nums.length / 3)) {
               ans.add(el.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,7,7};
        System.out.println(majorityElement(arr));
    }
}
