class MissingNum {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;   // 3
        for(int i=0; i<=n; i++){
            if(i<n){
            if(nums[i]!=i){   //0 1 3
                return i;
            }
        }
            if(i==n){
               if(nums[i-1]==n){
                   return n-1;
               } 
            }
            
        }
        return n;
    }
}
