import java.util.Arrays;

public class FindMedian {
	public static void main(String[] args){
		int[] a = {1,3};
		int[] b = {2,4};
		findMedianSortArrays(a,b);
	}
	
	public static double findMedianSortArrays(int[] nums1, int[] nums2){
		double findMedianNum = 0.0;
		int[] numsNew = new int[nums1.length+nums2.length];
		for(int i = 0; i < nums1.length; i++){
			numsNew[i] = nums1[i];
			//System.out.println(numsNew[i]);
		}
		for(int i = nums1.length, j = 0; i < numsNew.length; i++){
			if(j<nums2.length){
				numsNew[i] = nums2[j];
				j++;
			}
		}
		Arrays.sort(numsNew);
		if(numsNew.length % 2 == 1){
			findMedianNum = numsNew[(numsNew.length + 1) / 2 - 1];
		}else{
			findMedianNum = (numsNew[numsNew.length/2] + numsNew[numsNew.length / 2 - 1])/(2*1.0);
		}
		System.out.println(findMedianNum);
		return findMedianNum;
	}
}
