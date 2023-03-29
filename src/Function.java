import java.util.Scanner;
public class Function {

  public  static  void sum_ofnumber(int a, int b){

      int c = a+b;
      System.out.println("the sum is  :"+c);
  }

  public  static  void swap(int a,int b){

      int temp = a;
         a = b;
         b = temp;
      System.out.println("a = "+a);
      System.out.println("b ="+b);
  }

  public static int sum(int a,int b){ // paramateres or formal param

      int d = a+b;
      return  d;
  }

  public static  int Product(int a, int b){

      return a*b;
  }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n ;
        int a , b;
        System.out.println("Enter the first number :");
        a =  sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        sum_ofnumber(a,b);
     int ans = sum(a,b); // arguments or actual param
        System.out.println(ans);

        // swap - value exchange
        swap(a,b);
       int p = Product(a,b);
        System.out.println("Product ="+p);

    }
}
