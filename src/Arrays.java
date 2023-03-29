import java.util.Scanner;
public class Arrays {


    public static  void main(String[] args){
        int marks[] = new int[50]; // size is static
        int number[] = {1,2,3};
        String fruit[] = {"apple","mango","banana"};

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt();// chem
        marks[2] = sc.nextInt();// math

        System.out.println("phy "+ marks[0]);
        System.out.println("chem "+marks[1]);
        System.out.println("math "+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage is = "+percentage + "%");
        System.out.println("length of arr is :" +marks.length);


    }
}
