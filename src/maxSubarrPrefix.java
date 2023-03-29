import java.util.*;
public class maxSubarrPrefix {
    public static void maxSubarr(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // -infinity
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i <prefix.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];

        }
        for(int i = 0 ; i<arr.length; i++){
            int start = i;
            for (int j = i; j <arr.length ; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                if(maxSum < currSum){

                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void kadanes(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i <arr.length ; i++) {

            curSum +=arr[i];

            if(maxSum < curSum){

                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }

        }
        System.out.println("max sum is "+maxSum);
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

//        maxSubarr(arr);
          kadanes(arr);

    }
}


