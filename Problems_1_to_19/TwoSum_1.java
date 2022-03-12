package Problems_1_to_19;

public class TwoSum_1 {

	public static void main(String[] args) {
		int[] ar = new int[] {3,2,4};
		int target = 6;
		
		int[] result = twoSum(ar, target);
		System.out.println("[" + result[0] + "," + result[1] + "]");
	}
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			return new int[]{i, j};
        		}
        	}
        }
        return null;
    }

}
