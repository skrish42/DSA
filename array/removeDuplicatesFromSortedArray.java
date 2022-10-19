import java.util.*;

class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main (String[] args){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter the no, of elements: ");
        int n = x.nextInt();
        int[] num = new int[n];
        
        for(int a=0; a<n; a++){
            num[a] = x.nextInt();
        }
    
        System.out.println(check(num));
    }
}