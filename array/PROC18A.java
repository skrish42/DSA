/* package codechef; // don't place package name! */
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner x = new Scanner(System.in);
		int TC = x.nextInt();

		for(int i=0; i<TC; i++){
		    int TrackLen = x.nextInt();
		    int MaxDist = x.nextInt();
		    int a[] = new int[TrackLen];
		    for(int j=0; j<TrackLen; j++){
		        a[j] = x.nextInt();
		    }
		    
		     //find the max elt in array for max no. of girls
		     for(int k=0; k<a.length; k++){
		         for(int l=k+1; l<a.length; l++){
		             int temp=0;
		             if(a[k]<a[l]){
		                 temp = a[k];
		                 a[k] = a[l];
		                 a[l] = temp;
		             }
		         }
		     }
		     
		     for(int j=0; j<MaxDist; j++){
		         System.out.print(a[j]);
		     }

		}
	}
}
