import java.util.Scanner;
public class LinearSearch {

    public static int linearsearch(int arr[], int number){

        for (int i = 0; i < arr.length; i++) {

            if(number == arr[i]){

                return i;
            }

        }
        return  -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of arr :");
        for(int i = 0 ; i<size; i++){

            arr[i] = sc.nextInt();

        }
        System.out.println("enter the  number you wanna find :");
        int number = sc.nextInt();
       int index = linearsearch(arr,number);
        if(index == -1){

            System.out.println("Not found");
        }
        else {

            System.out.println("number is at index : "+index);
        }

    }
}

