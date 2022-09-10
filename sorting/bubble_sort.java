import java.util.Scanner;
import java.utils.*;

public class bubble_sort {

    // function for selection sort
    public static void bubble(int[] arr, int n){ 
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            }
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

      bubble(arr, n);


    }
  }