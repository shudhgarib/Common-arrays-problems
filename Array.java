
// array as Function argument 
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    // Simple Array Number Printing

    public int fun(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        return 0;
    }

    // Update The Array Number Custom Wise

    Scanner sc = new Scanner(System.in);

    public int Update(int array[]) {
        System.out.println("\nEnter The Index No. Which U Want To Update. : ");
        int IndexNo = sc.nextInt();

        System.out.println("Enter The No. : ");
        int NewNo = sc.nextInt();

        array[IndexNo] = NewNo; // Logic

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        return 0;
    }

    // Performing Linear Search or searching key element

    public int LinearSearch(int array[], int key) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == key) {
                System.out.println("Key Index At : " + i);
            }
        }
        return 0;
    }

    // Largest In Array

    public int Largest(int array[], int key) {
        int min_Value = Integer.MIN_VALUE;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > min_Value) {
                min_Value = array[i];
            }
        }
        System.out.println("Largest Value : " + min_Value);
        return 0;
    }

    // Smallest In Array

    public int Smallest(int array[], int key) {
        int max_Value = Integer.MAX_VALUE;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < max_Value) {
                max_Value = array[i];
            }
        }
        System.out.println("Smallest Value : " + max_Value);
        return 0;
    }

    // Smallest even or odd number

    public int Smallest_even_odd(int arr[]) {

        int max_Value = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (max_Value > arr[i]) {
                max_Value = arr[i];
            }
        }
        if (max_Value % 2 == 0) {
            System.out.println("Smallest Even No. : " + max_Value);
        } else {
            System.out.println("Smallest Odd No. : " + max_Value);
        }

        return 0;
    }

    // Smallest even or odd number

    public int Largest_even_odd(int arr[]) {

        int min_Value = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (min_Value < arr[i]) {
                min_Value = arr[i];
            }
        }
        if (min_Value % 2 == 0) {
            System.out.println("Largest Even No. : " + min_Value);
        } else {
            System.out.println("Largest Odd No. : " + min_Value);
        }
        return 0;
    }

    // Second Largest No.

    public void Second_Largest(int arr[]) {
        int Second_Largest_No, i = 0;
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Second_Largest_No = arr[i - 2];
        System.out.println("Second Largest No. : " + Second_Largest_No);
    }

    // Find a peak element which is not smaller than its neighbours

    public void peak(int arr[]) {
        int peak_element = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                peak_element = arr[i];
                break;
            }
        }
        System.out.println("Peak Element : " + peak_element);
    }

    //

    public static void main(String[] args) {
        // int key = 8;
        // int[] arr = {2,4,6,8,11};
        int[] arr = { 5, 10, 20, 15 };
        Array obj = new Array();
        // obj.peak(arr);
        // obj.fun(arr);
        // obj.Update(arr);
        // obj.LinearSearch(arr,key);
        // obj.Largest(arr,key);
        // obj.Smallest(arr,key);
        // obj.Smallest_even_odd(arr);
        obj.Largest_even_odd(arr);
        obj.Second_Largest(arr);
    }
}
