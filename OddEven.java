import java.util.Scanner ;

class OddEven {

    static String findOddEven(int number){
        if((number & 1) == 0)
            return "Even";
        else
            return "Odd";    
    }

    public static void main(String... X){

        Scanner sc= new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(number+  " is " +findOddEven(number));
    }
}