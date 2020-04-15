import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {

    }

    private int missingNumber(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        for (int i=0; i< nums.length+1; i++){
            if(!numSet.contains(i)) return i;
        }
        return -1;
    }
}
