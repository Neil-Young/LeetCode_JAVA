import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesfromSortedArray {
    public static void main(String[] args){
        int[] num = {1,1,2,3,3,3};
        removeDuplicates(num);
    }
    //HashSet could solve this problem easily, but the requirement of this problem does not allow to allocate an extra space for another array.
    /*public static int removeDuplicates(int[] nums){
        Set s = new HashSet();
        for(int i = 0; i < nums.length; i++){
            s.add(nums[i]);
        }
        System.out.println(s.size());
        System.out.println(s);
        return s.size();
    }*/

    public static int removeDuplicates(int[] nums){
        int countNum = 1;
        if(nums == null || nums.length <= 1){
            return nums == null? 0 : nums.length;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[countNum++] = nums[i];
            }
        }
        System.out.println(countNum);
        return countNum;
    }
}
