import java.util.Scanner;
import java.utils.*;

public class selection_sort {

    // function for selection sort
    public static void selection(int[] arr, int n){ 
      //selection sort
      for (int i = 0; i < n-1; i++) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[min]) {
            min = j;
          }
        }

        //swap - it is inside the outer for loop
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

      }
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
        System.out.print("Enter elements: ");
        arr[l] = x.nextInt();
      }
      System.out.println();

      selection(arr, n);


    }
  }