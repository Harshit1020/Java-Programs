import java.util.Scanner;
public class Pattern {

    public  static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
//        for(int i = 0; i<=n; i++){
//            int k = n-i;
//            for (int j=0; j<=i ; j++){
//                System.out.print(k+" ");
//                k++;
//            }
//
//            System.out.println();
//        }

//        for(int i =1; i<=n; i++){
//            if(i % 2 == 0){
//                for (int j =2; j <=2*i; j+=2) {
//
//                    System.out.print(j + " ");
//                }
//            }
//            else {
//                for (int j = 1; j <=2*i; j+=2) {
//                    System.out.print(j+" ");
//                }
//            }
//
//            System.out.println();
//        }


//        for (int i = 1; i <=n ; i++) {
//
//            for (int j = 1; j <=i ; j++) {
//
//                System.out.print((char) (64 + i) + " ");
//
//            }
//
//            System.out.println();
//        }


//        for (int i = 1; i <=n ; i++) {
//
//            for (int j = 1; j <=i ; j++) {
//
//                System.out.print((char) (64 + j) + " ");
//
//            }
//
//            System.out.println();
//        }

//        for (int i = n; i>=1; i-=2) {
//            for (int j=i; j<=n; j+=2) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <=n ; i++) {
//            for (int j =0; j <i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * (n-i) -1; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


        for(int i = 1; i<=n; i++)
        {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {

                if(j == 1 || i == n || j == 2*i-1){

                    System.out.print(j);

                }
                System.out.print(" ");
            }

            System.out.println();
        }



    }
}
