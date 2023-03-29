import java.util.Scanner;
public class functionAsarguments {

    public  static  void updte(int marks[]){

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] +1;

        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        int marks[] = new int[50];

        int marks[] = {70,67,89};
        updte(marks);

        for (int i = 0; i<marks.length; i++){

            System.out.println(marks[i]);
        }




    }
}


