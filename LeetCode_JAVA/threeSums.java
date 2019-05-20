import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class threeSums {
	public static void main(String[] args){
		int[] num = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		threeSum(num);
	}
	
	public static List<List<Integer>> threeSum(int[] nums){
		ArrayList<Integer> listA = new ArrayList<Integer>();
		List<List<Integer>> listB = new ArrayList<List<Integer>>();
		for(int i = 0; i < nums.length-2; i++){
			for(int j = i + 1; j < nums.length - 1; j++){
				for(int t = j +1; t < nums.length; t++){
					if(nums[i] + nums[j] + nums[t] == 0){
						listA.add(nums[i]);
						listA.add(nums[j]);
						listA.add(nums[t]);
						Collections.sort(listA);
						listB.add(listA);
						listA = new ArrayList<Integer>();
					}
				}
			}
		}
		for(int i = 0 ; i < listB.size(); i++){
			for(int j = listB.size()-1; j > i; j--){
				if(listB.get(i).get(0) == listB.get(j).get(0) && listB.get(i).get(1) == listB.get(j).get(1) && listB.get(i).get(2) == listB.get(j).get(2)){
					listB.remove(j);
				}
			}
		}
		System.out.println(listB);
		return listB;
	}
}
