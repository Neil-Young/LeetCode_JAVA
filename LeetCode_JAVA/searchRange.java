public class searchRange {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        //using the 'count' variable to recognise if the 'target' exists in the 'nums'
        int count = 0;

        //return {-1,-1} when the nums is null
        //or there is only one variable in the 'nums' and it doesn't match the 'target'
        if (nums == null || nums.length < 1) {
            result[0] = -1;
            result[1] = -1;
        } else if (nums.length == 1 && nums[0] != target) {
            result[0] = -1;
            result[1] = -1;
        } else { // using 'half-intervalsearch' to find the target
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                if (nums[left] == target) { // starting from the beginning of the 'nums' and stopping when it finds the first target
                    result[0] = left;
                    count++;
                    break;
                } else {
                    left++;
                }
            }
            while (left <= right) {
                if (nums[right] == target) {// starting from the end of the 'nums' to search the target
                    result[1] = right; // the searching will be stopped if the last 'target' is found or the right pointer moves back to the fist target, which means there is only one target in the 'nums'
                    count++;
                    break;
                } else {
                    right--;
                }
            }

            // count equals to 0, which means there is no target number in the 'nums'
            // the situation, "nums = {1}, target = 1" ,needs to be considered,because the answer is [0,0]
            if (result[0] == 0 && result[1] == 0 && count == 0) {
                result[0] = -1;
                result[1] = -1;
            }
        }
        return result;
    }
}
