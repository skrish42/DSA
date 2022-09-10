/* package codechef; // don't place package name! */

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
		    int DollsCount = x.nextInt();
		    int types[] = new int[DollsCount];
		    for(int j=0; j<DollsCount; j++){ // for loop - getting input
                types[j] = x.nextInt();
		    }
		    
		    int count = 0;     // checking pairs
		    for(int k=0; k<types.length; k++){
		        if(types[k]%2 != 0){
		            count++;
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}
