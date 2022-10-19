class ConsecOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count, sam, max;
        count = sam = max= 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                
            }
            if(nums[i] == 0){
                count++;
                sam = count-1;
                count=0;

            }
            if(max < sam){
                max= sam;
            }
                
        }
        if(max<count){
            return count;
        }
        return max;
    }
}