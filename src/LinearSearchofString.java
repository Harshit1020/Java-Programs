import java.util.Scanner;
public class LinearSearchofString {

    public static int strFind(String str[], String name){

        for (int i = 0; i<str.length; i++){
            if(name.equals(str[i])){
                return  i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str[] = new String[size];
        for(int i = 0; i<size; i++){
            str[i] = sc.next();
        }
        for (int i = 0; i <size ; i++) {
            System.out.println(str[i]);

        }
        System.out.println("enter the name you wanna find here...");
        String name = sc.next();
        int index = strFind(str,name);
         if(index == -1){

             System.out.println("not found ..");
         }
         else {

             System.out.println("name is found at index "+index);
         }
    }
}
