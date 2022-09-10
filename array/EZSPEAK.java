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
		int TestCase = x.nextInt();
		for(int i=0; i<TestCase; i++){
		   int StringLen = x.nextInt(); 
		   String inpStr = x.next().toLowerCase();
		   String check = "";
                for(int j=0; j<inpStr.length(); j++){
                    char s1 = inpStr.charAt(j);
                    
                    if (s1=='a' || s1=='e' || s1=='i' || s1=='o' ||s1=='u'){
                        continue;
                    }
                    else{
                        check += s1;
                    }
                }
                if(check.length() >= 4){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
		    
		   
		}
	}
}
