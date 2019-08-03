public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target){
        int pos = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                pos = i;
            }
        }
        if (pos == -1){
            for (int i = 0; i < nums.length; i++){
                if (target < nums[i]){
                    pos = i;
                    break;
                }
            }
        }
        if (pos == -1){
            pos = nums.length;
        }
        return pos;
    }
}
