import java.sql.SQLOutput;
import java.util.HashSet;

public class DuplicatePrintOnce {
    static void main() {
        int [] nums={1,2,3,4,2,1,1,3};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!set.add(nums[i]))
            {
                if(duplicate.add(nums[i]))
                {
                    System.out.println("Duplicates are: "+nums[i]);
                }
            }
        }
        return;
    }
}
