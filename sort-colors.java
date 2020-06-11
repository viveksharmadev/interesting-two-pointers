// https://leetcode.com/problems/sort-colors/
class sort-colors {
    // tc -> n, sc-> 1
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<2) return;
        int start = 0, end = nums.length-1;
        
        for(int i=start; i<=end;){
            if(nums[i]==0){
                swap(nums, start, i);
                start++;
                i++;
            }else if(nums[i]==2){
                swap(nums, end, i);
                end--;
            }else{
                i++;
            }
        }
    }
    
    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
