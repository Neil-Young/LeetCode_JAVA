import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args){
		int[] numarr = {0,2,1,-3};
		threeSumClosest(numarr,1);
	}
	
	public static int threeSumClosest(int[] nums, int target){
		int closestTarget = Integer.MAX_VALUE;
		int closestSum = 0;
		Arrays.sort(nums);
		if(nums.length < 3 || nums == null){
			closestSum = 0;
		}else{
			for(int i = 0; i < nums.length - 2; i++){
				int left = i + 1;
				int right = nums.length - 1;
				while(left < right){
					int sum = nums[i] + nums[left] + nums[right];
					if(Math.abs(target - sum) < closestTarget){
						closestTarget = Math.abs(target - sum);
						closestSum = sum;
					}
					if(target == sum){
						return closestSum;
					}else if (target > sum){
						left++;
					}else{
						right--;
					}
				}
			}
		}
		System.out.println(closestSum);
		return closestSum;
	}
}
