import java.util.*;
public class MaxsubArraySum {
    public static void maxSubarr(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                    currSum = 0;
                for (int k = i; k <=j ; k++) {

                    currSum += arr[k];
                }
                System.out.print(currSum +" ");
                if(maxSum < currSum){

                    maxSum = currSum;

                }
            }
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        maxSubarr(arr);
    }
}


