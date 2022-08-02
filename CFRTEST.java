/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner x = new Scanner(System.in);
		int TC = x.nextInt();
		for(int i=0; i<TC; i++){
		    int n = x.nextInt();
            int a[]=new int[n+1];

            for(int j=0;j<n;j++)
            {
                a[j]=x.nextInt();
            }
 
            int count=0;
            for(int k=0;k<n;k++)
            {
                if(a[k]!=a[k+1])
                {
                    count++;
                }
            }
            System.out.println(count);


		}
		
	}
}