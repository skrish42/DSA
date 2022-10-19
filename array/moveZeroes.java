class moveZeroes {
    public void mvZeroes(int[] nums) {
        int j=0;
        int temp;
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            } 
        }
    }
    public static void main(String args[]) {
        int n=5;
        
        int arr[]= {1,2,3,4,5};
        mvZeroes(arr, n);
      }
      }