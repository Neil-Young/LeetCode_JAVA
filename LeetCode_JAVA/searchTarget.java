public class searchTarget {
    public static void main(String[] args){
        int[] nums = {};
        int target = 5;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target){
        int position = -1;
        int minValue = Integer.MAX_VALUE;
        int left=0;
        int right = Integer.MAX_VALUE;
        //nums为空的时候返回-1
        if (nums.length == 0) return position;
        //遍历数组，找到最小值的位置，并进行记录
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < minValue){
                minValue = nums[i];
                right = i;
            }
        }
        //用类似二分法来对一半的数组进行查找，因为题目要求时间复杂度为O(log n)
        if(target <= nums[nums.length-1]){
            for (int i = right; i < nums.length; i++){
                if (nums[i] == target){
                    position = i;
                }
            }
        }else{
            for (int i = left; i < right; i++){
                if (nums[i] == target){
                    position = i;
                }
            }
        }
        return position;
    }
}
