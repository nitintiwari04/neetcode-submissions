class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
     
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            //Two-Pointer
            int j = i+1;     int k = n-1;
            int target = -(nums[i]);
            
            while(j < k){
            if(nums[j] + nums[k] == target && !set.contains(Arrays.asList(nums[i], nums[j], nums[k]))){
               ans.add((Arrays.asList(nums[i], nums[j], nums[k])));
               set.add((Arrays.asList(nums[i], nums[j], nums[k])));
               
            }else if(nums[j] + nums[k] > target){
                k--;
            }else{
                j++;
            }
        }
        }
        return ans;
    }
}
