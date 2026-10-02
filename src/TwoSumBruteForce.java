public class TwoSumBruteForce {
    static void main() {
        int []nums={2,7,11,15};
        int target=26;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(target==(nums[i]+nums[j]))
                {
                    System.out.println("Pair found "+i+" , "+j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}
