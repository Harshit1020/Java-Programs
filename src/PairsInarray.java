import java.util.Scanner;
public class PairsInarray {

    public static void printPairs(int arr[]){
    int tp = 0;
        for (int i = 0; i <arr.length ; i++) {
            int current = arr[i];

            for (int j = i+1; j <arr.length ; j++) {

                System.out.print("("+current +","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("the total pairs is a :"+tp);
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

        printPairs(arr);
    }
}
