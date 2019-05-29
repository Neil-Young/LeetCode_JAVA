import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args){
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		fourSum(nums,0);
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //Arrays is sorted to {-2,-1,0,0,1,2}
        for(int i = 0; i < nums.length; i++){
        	int tempTarget = target - nums[i]; //确认第一位数字后 寻找三个数字相加等于 target减去第一个数字
        	//三个数字相加可以用threeSum的二分法查找
        	for(int j = i + 1; j < nums.length - 1; j++){
        		int threeSumTarget = tempTarget - nums[j];
        		int left = j + 1;
        		int right = nums.length - 1;
        		while(left < right){
        			if(nums[left] + nums[right] == threeSumTarget && !res.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))){
        				res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
        				left++;
        				right--;
        				while (left < right && nums[left] == nums[left - 1]) left++; 
                        while (left < right && nums[right] == nums[right + 1]) right--; 
        			}else if(nums[left] + nums[right] < threeSumTarget){
            			left++;
            		}
            		else{
            			right--;
            		}
        		}
        	}
        }
        System.out.println(res);
		return res;
	}
}
