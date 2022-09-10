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
		int count=0;
		for(int i=0; i<TC; i++){
		    int probCount = x.nextInt();
		    for(int j=0; j<probCount; j++){
		        int ProbNum = x.nextInt();
		        int score = x.nextInt();
		        if(ProbNum == 9 || ProbNum == 10 || ProbNum == 11){
		            continue;
		        }
		        else{
		            count+=score;
		        }
		    }
		}
	}
}
