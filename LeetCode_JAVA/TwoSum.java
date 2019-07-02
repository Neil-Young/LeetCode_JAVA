import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args){
		int[] b = {3,2,4};
		twoSum(b,6);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] c = new int[2];
	    for(int i = 0; i < nums.length; i++){
	    	for(int j = i + 1; j <=nums.length-1; j++){
	    		if((nums[i] + nums[j]) == target){
	    			c[0] = i;
	    			c[1] = j;
	            }
	        }
	    }
	    System.out.println(c[0]);
	    System.out.println(c[1]);
	    return c;
	}
}
