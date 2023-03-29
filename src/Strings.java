public class Strings {

    public static boolean pali(String str){

        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){

                return false;

            }
        }

        return true;
    }

    public  static  float shortestPath(String str){

        int x = 0;
        int y = 0;

        for(int i = 0; i<str.length(); i++){

            int dir = str.charAt(i);

            if(dir == 'S'){

                y--;
            } else if (dir == 'N') {

                y++;
            }
            else if(dir == 'W'){

                x--;
            }
            else{

                x++;
            }

        }

        int xsqr = x*x;
        int ysqr = y*y;

        return (float)Math.sqrt(xsqr + ysqr);

    }

    public  static String substring(String str, int si, int ei){

        String substr = "";
        for(int i = si; i<ei; i++) {

            substr += str.charAt(i);

        }
        return substr;
    }

    public static void largest(String[] str){
        String large = str[0];
        for(int i = 1; i<str.length; i++){

            if(large.compareTo(str[i]) <0){
                large = str[i];

            }

        }

        System.out.println(large);

    }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String str;
//        str = sc.next();
        String arr[] = {"apple","mango","banana"};
//        System.out.println(pali(str));
//        System.out.println(shortestPath(str));
//        System.out.println(substring(str,0,5));
//        System.out.println(str.substring(0,5));
            largest(arr);

    }
}
