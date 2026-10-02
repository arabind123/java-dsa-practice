import java.util.HashMap;

public class TwoSumHashMap {
    static void main() {
        int[] nums = {2,5 ,7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            int complement=target-nums[i];
            if(map.containsKey(complement))
            {
                System.out.println("Pair found at "+map.get(complement)+" , "+i);
                return;
            }
            map.put(nums[i],i);
        }
        System.out.println("Pair not found");
    }

}
