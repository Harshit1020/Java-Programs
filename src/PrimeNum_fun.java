import java.util.Scanner;
public class PrimeNum_fun {

    public static boolean primeNume(int n){
//        boolean isPrime = true;
        // corner case
        if(n==2){

            return  true;
        }
        for (int i = 2; i <=n-1; i++) {

            if(n%i == 0){// completely divide..............

//                isPrime = false;
//                break;
                return false;
            }

        }

            return true;

    }

    // optimise method
    public static  boolean isPrime(int n){

        if(n ==2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){

            if(n%i == 0){
                return  false;
            }
        }

        return true;
    }
// Prime number in range

    public static void primeInrange(int n){

        for(int i =2; i<n; i++){

            if(isPrime(i)){

                System.out.println(i);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println( primeNume(n));
//        System.out.println(isPrime(n));
        primeInrange(n);
    }
}
