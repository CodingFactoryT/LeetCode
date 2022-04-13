package Problems_20_to_39;

public class P0026_RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] ar = new int[]{0,0,1,1,1,1,1,1,1,1,2};
		System.out.println(removeDuplicates(ar));
	}
	
	public static int removeDuplicates(int[] nums) {
		int counter = nums.length;
		
		for(int i = 0; i < nums.length -1; i++) {	
        	if(nums[i] == nums[i+1] && nums[i+1] != 404) {		//404 is a placeholder
        		for(int j = i; j < nums.length -1; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length -1] = 404;
        		i--;
        		counter--;
        	} 
        }
        return counter;
    }
}
