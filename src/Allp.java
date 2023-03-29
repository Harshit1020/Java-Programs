import java.util.Scanner;
public class Allp {
    public static  void dectobin(int n){

        int myNum = n;
        int pow = 0;
        int BinNum = 0;

        while(n > 0){


            int rem = n % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10,pow));
            n = n/2;
            pow++;

        }
        System.out.println("Number is  = "+myNum +"and a binary is ="+BinNum);

    }

    public  static  void bintodec(int n){

        int myNum = n;
        int pow = 0;
        int decNum = 0;
        while(n >0){

            int rem = n % 10;
            decNum = decNum + (rem * (int) Math.pow(2,pow));
            n = n/10;
            pow++;

        }
        System.out.println("the value is "+ myNum + " and a decimal number is :"+decNum);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = sc.nextInt();
//        dectobin(n);
        bintodec(n);

    }
}
