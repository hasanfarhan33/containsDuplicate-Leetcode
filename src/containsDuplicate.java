import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 2, 1, 5, 6};
        System.out.println(anyDuplicates(nums));


    }

    public static boolean anyDuplicates(int[] nums) {
        HashSet<Integer> visitedSet = new HashSet<Integer>();
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                if(visitedSet.contains(nums[i])) {
                    return true;
                }
                else {
                    visitedSet.add(nums[i]);
                }
            }
            return false;
        }
    }
}
