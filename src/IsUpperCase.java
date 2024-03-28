import java.util.Scanner;

public class IsUpperCase {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a Char? : ");
        char valueChar= input.next().charAt(1);
        //is lower case
        if('A' <= valueChar && valueChar<= 'Z'){
            System.out.println( "it is  upper case");

        }else {
            System.out.println("it is not upper case");
        }
    }
}
