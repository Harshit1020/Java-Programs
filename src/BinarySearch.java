import java.util.Scanner;
public class BinarySearch {

public static int BSprogram(int arr[] , int num){

    int start = 0;
    int end = arr.length -1;

    while(start <= end){

        int mid = start + (end - start) /2;
        if(arr[mid] == num){

            return  mid;
        }
        else if(arr[mid] > num ){

            end = mid -1;

        }
        else{

            start = mid + 1;

        }

    }

return  -1;
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
        System.out.println("enter the numbe you want to search :");
        int number = sc.nextInt();
         int res =  BSprogram(arr,number);
        System.out.println("the index of number is "+res);
        if(res == -1){
            System.out.println("not found here!");
        }

    }
}

