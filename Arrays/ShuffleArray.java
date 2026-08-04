class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] ans = new int[nums.length];
        for(int k = 0; k<n;k++){
           ans[2*k]=nums[i];
           ans[2*k+1]=nums[j];
            i++;
            j++;
        }
        return ans;
    }
}