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
		    int strLen = x.nextInt();
		    int start = x.nextInt();
         String dir= x.next();
		    /*String dir[] = new String[strLen];
		    for(int j=0; j<dir.length; j++){
		        dir[j] = x.next();
		    }*/
		    
		    int path[] = new int[strLen+1];
		    path[0]=start;
		    int count=0;
		    int a=1;
		    for(int k=0; k<dir.length(); k++){
		        if(dir.charAt(k)=='R'){
		            start++;
		            path[a] =start;
		            a++;
		        }
		        else if(dir.charAt(k)=='L'){
		            start--;
		            path[a] = start;
		            a++;
		        }
		    }
      for(int xx=0; xx<path.length; xx++){
        System.out.println(path[xx]);
      }
		    
            int dist = 0;
             
                for (int l = 0; l < path.length; l++)
                {
                  int m=0;
                    for (m = 0; m < l; m++)
                        if (path[l] == path[m])
                            break;
                    if(l == m)
                      dist++;
                    
                }

                System.out.println(dist);
		    
		}
	}
  }
