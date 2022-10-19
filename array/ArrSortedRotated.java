import java.util.*;
import java.io.*;

/* 
 
1752. Check if Array Is Sorted and Rotated
Given an array nums, return true if the array was originally sorted in non-decreasing order, then
 rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length 
such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 */


class ArrSortedRotated {
    static boolean check(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            if ( nums[i] > nums[(i+1) % n]){
                k++;
            }
            if(k>1){
                return false;
            }
        }
        return true;
        
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



/*

2124. Check if All A's Appears Before All B's --
Given a string s consisting of only the characters 'a' and 'b', 
return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

class Solution {
    public boolean checkString(String s) {
        int k=0;
        int n = s.length();
        for(int i=0; i<n-1; i++){
            int charCompare = Character.compare(s.charAt(i),s.charAt(i+1));
            if(charCompare>0){
                return false;
            }
        }
        return true;
    }
} 

*/