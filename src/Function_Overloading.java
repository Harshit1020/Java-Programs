public class Function_Overloading {
// FUNCTION OVERLOADING --> SAME NAME BUT DIFFRENT PARAMETERS
// function to calculate 2 numbers sum
    public  static  int sum(int a, int b){

        return  a+b;

    }
    // function to calculate 3 numbers sum
    public static  int sum(int a,int b, int c){

        return a+b+c;

    }
    //FUNCTION OVERLOADING --> using DataTypes
    // function to calculate int number sum
    public static int add(int a,int b){

        return  a+b;

    }
    // function to calculate float number sum

    public  static float add(float a,float b){

        return  a+b;
    }
    public static void main(String[] args) {

//        System.out.println(sum(5,3));
//        System.out.println(sum(5,2,1));
        System.out.println(add(3,5));
        System.out.println(add(3.2f,4.8f));



    }
}
