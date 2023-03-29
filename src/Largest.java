import java.util.*;
public class Largest {
    public static int getLargest(int arr[]){

        int largets = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i <arr.length ; i++) {
            if(largets < arr[i]){

                largets = arr[i];

            }
            if(smallest > arr[i]){

                smallest = arr[i];
            }
        }

        System.out.println("smallest is a"+smallest);
        return largets;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if(max < arr[i]){
//
//                max = arr[i];
//            }
//        }
//        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of array:");
        for(int i = 0; i<size; i++){

            arr[i] = sc.nextInt();

        }
        int bigNum = getLargest(arr);
        System.out.println("laregst is "+bigNum);
    }
}
