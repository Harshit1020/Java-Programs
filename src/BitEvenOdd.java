import  java.util.*;
public class BitEvenOdd {

    public static int GetithBit(int n, int i){

        int BitMask = 1<<i;
        if((n & BitMask) == 0){

            return 0;
        }
        else {

            return 1;
        }

    }
    public static void Evenodd(int n){

        int BitMask = 1;

        if( (n & 1) == 0){

            System.out.println("Number is even");

        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
//        Evenodd(n);
        int  ans =  GetithBit(n,i);
        System.out.println(ans);

    }
}
