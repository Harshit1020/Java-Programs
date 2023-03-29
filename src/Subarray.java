import java.util.Scanner;
public class Subarray {

    public static void printSubarr(int arr[]){

        int ts = 0;
        for (int i = 0; i <arr.length ; i++) {
            int start = i;
            for (int j = i; j <arr.length ; j++) {
                int end = j;
                for (int k = start; k <=end ; k++) {
                    System.out.print(arr[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub arr is :"+ts);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        printSubarr(arr);

    }
}

