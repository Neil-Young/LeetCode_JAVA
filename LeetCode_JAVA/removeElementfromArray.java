public class removeElementfromArray {
    public static void main(String[] args){
        int[] num = {1};
        removeElement(num,1);
    }

    public static int removeElement(int[] nums, int val){
        int countNum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
               nums[countNum++] = nums[i];
            }
        }
        return countNum;
    }
}
