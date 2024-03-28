import java.util.Scanner;

public class IsDigit {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a digit? : ");
        int value = input.nextInt();
        //is it a digit case
        if('0' >= value && value<= '9'){
            System.out.println( "it is  a digit " + value);

        }else {
            System.out.println("it is not a digit case " +  value);
        }
    }
}
