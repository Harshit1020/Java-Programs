// All sorting algorithm ........

// Bubble sort
// Selection sort

import java.util.Scanner;
public class BubbleSort {
    // Bubble sort
    public  static  void bubleSort(int arr[]){


    }
    // Bubble sort
    public  static void printArr(int arr[]){

        for(int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");

        }

    }

    // Selection  sort
    public  static   void Selectionsort(int arr[]){
        for (int i = 0; i <arr.length -1;  i++) {
            int maxPos = i;
            for (int j = 1+1; j <arr.length ; j++) {
                if(arr[maxPos] > arr[j]){
                    maxPos = j;
                }
            }
            // swap
            int temp  = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of arr :");
        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }
//        bubleSort(arr);
        Selectionsort(arr);
        printArr(arr);
    }
}
