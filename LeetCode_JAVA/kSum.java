import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class kSum {
	public static void main(String[] args){
		int[] num = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		threeSum(num);
	}
	
	public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
        	if(i != 0 && nums[i] == nums[i - 1]){
        		continue;
        	}
        	int target = -nums[i];
        	int j = i + 1;
        	int k = nums.length - 1;
        	while(j < k){
        		if(nums[j] + nums[k] == target){
        			res.add(Arrays.asList(nums[i], nums[j], nums[k]));
        			j++;
        			k--;
        			while (j < k && nums[j] == nums[j - 1]) j++; 
                    while (j < k && nums[k] == nums[k + 1]) k--; 
        		}
        		else if(nums[j] + nums[k] < target){
        			j++;
        		}
        		else{
        			k--;
        		}
        	}
        }
        System.out.println(res);
		return res;
	}
}
