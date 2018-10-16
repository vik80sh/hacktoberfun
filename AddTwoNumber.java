import java.util.Scanner ;

public class AddTwoNumer {

  static int sum(int firstNumber , int secondNumber){
    return firstNumber + secondNumber ;
}

  public static void main(String... X){
    Scanner sc = new Scanner(System.in);
    
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();
    
    System.out.println(firstNumber+" + " +secondNumber+ " = " +sum(firstNumber , secondNumber));
  }
}
