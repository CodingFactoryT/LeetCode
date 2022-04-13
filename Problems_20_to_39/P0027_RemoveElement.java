package Problems_20_to_39;

public class P0027_RemoveElement {

	public static void main(String[] args) {
		int[] ar = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		int count = removeElement(ar, val);
		System.out.println(count);
	}
	
	public static int removeElement(int[] nums, int val) {
		int counter = nums.length;
        for(int i = 0; i < nums.length; i++) {
        	while(nums[i] == val) {
        		for(int j = i; j < nums.length -1; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length -1] = -1;
        		counter--;
        	}
        }
        return counter;
    }

}
