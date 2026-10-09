import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    static void main(String[] args) {
        int[] nums = {10, 25, 40, 15, 40, 30, 35, 25};
        System.out.println( Arrays.stream(nums)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1)
        );
    }
}
