import java.util.Scanner;
public class ReverseOfarray {

    public static void reverceArr(int arr[]){

        int start = 0;
        int end = arr.length -1;

        while(start < end){

            // swap
            int temp = arr[end];
            arr[start] = arr[end];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverceArr(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println("the reverse arr is"+ arr[i]);
        }
    }


}
