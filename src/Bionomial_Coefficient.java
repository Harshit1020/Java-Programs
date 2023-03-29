import java.util.Scanner;
public class Bionomial_Coefficient {

    public static  int Facto(int n){

        int fact = 1;
        for(int i = 1; i<=n; i++){

            fact = fact * i;
        }

        return fact;
    }


    public static  int bioCoefficient(int n , int r){


        int nfact = Facto(n);
        int rfact = Facto(r);
        int nrfact = Facto(n-r);
        int bc = nfact/ (rfact* nrfact);
        return bc;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int n = sc.nextInt();
        int r = sc.nextInt();
        int f   = Facto(n);
      int bc =  bioCoefficient(n ,r);
        System.out.println("bc is = "+bc);


    }
}
