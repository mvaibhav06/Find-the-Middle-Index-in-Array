class Solution {
    public int findLSum(int[] nums, int index){
        if(index == 0){
            return 0;
        }
        int sum = 0;
        for(int i=0; i<index; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int findRSum(int[] nums, int index){
        if(index == nums.length-1){
            return 0;
        }
        int sum = 0;
        for(int i=index+1; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int findMiddleIndex(int[] nums) {
        int out = -1;
        int j = nums.length-1;

        while(j >= 0){
            int leftSum = findLSum(nums,j);
            int rightSum = findRSum(nums,j);
            if(leftSum == rightSum){
                out = j;
            }
            j--;
        }
        return out;
    }
}
