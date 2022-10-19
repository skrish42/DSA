import java.util.Scanner;
import java.utils.*;

public class insertion_sort {

    // function for insertion sort
    public static void insertion(int[] arr, int n){ 
        // insert sort
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j]>current){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
          }

        //print sorted array
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String args[]) {
      Scanner x = new Scanner(System.in);

      System.out.print("Enter the number of elements: ");
      int n = x.nextInt();
      int[] arr = new int[n];
      for(int l=0; l<n; l++){
        System.out.print("Enter the "+arr[l]+" element: ");
        arr[l] = x.nextInt();
      }
      System.out.println();

      insertion(arr, n);


    }
  }