import java.util.Scanner;
public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }


}
