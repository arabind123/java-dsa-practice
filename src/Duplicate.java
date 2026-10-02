import java.util.HashSet;

public class Duplicate {
    static void main() {
        int [] nums={1,2,3,4,2,1,1,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!set.add(nums[i]))
            {
                System.out.println(nums[i]);
            }
        }
        return;
    }
}
