
public class theLargestArea {
	public static void main(String[] args){
		int[] h = {2,3,4,5,18,17,6};
		maxArea(h);
	}
	
	public static int maxArea(int[] height){
		int tempArea = 0; int maxarea = 0;
		for(int i = 0; i < height.length; i++){
			for(int j = i + 1; j < height.length; j++){
				if (height[i] <= height[j]){
					tempArea = height[i] * (j-i);
				}else{
					tempArea = height[j] * (j-i);
				}
				if(tempArea > maxarea){
					maxarea = tempArea;
				}
			}		
		}
		System.out.println(maxarea);
		return maxarea;
	}
}



/*int maxArea = 0;
int maxLeftHeight = 0;

for (int i = 0; i < heights.length - 1; i++) {
    if (heights[i] <= maxLeftHeight) {
        continue;
    }
    maxLeftHeight = heights[i];
    
    int maxRightHeight = 0;
    
    for (int j = heights.length - 1; j > i; j--) {
        if (heights[j] <= maxRightHeight) {
            continue;
        }
        maxRightHeight = heights[j];
        
        final int area = (j - i) * Math.min(heights[i], heights[j]);
        
        if (area > maxArea) {
            maxArea = area;
        }
        
        if (heights[i] <= heights[j]) {
            break;
        }
    }
}

return maxArea;*/