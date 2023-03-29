import java.util.Scanner;
public class Binary_to_Decimal {

    public static void bintodec(int n){

        int myNum = n;
        int pow = 0;
        int decNum = 0;

        while (n > 0){

            int rem = n %10;
            decNum = decNum + (rem*(int)Math.pow(2,pow));
            pow++;
            n = n/10;

        }

        System.out.println("the binaray number is :" +myNum + "and the decimal num is "+ decNum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        bintodec(n);



    }
}

