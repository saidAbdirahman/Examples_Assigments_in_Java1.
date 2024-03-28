import java.util.Scanner;

public class IsLetter {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a Char? : ");
        char valueChar= input.next().charAt(0);
        //is lower case
        if('A' <= valueChar && valueChar<= 'Z' || 'a' <= valueChar && valueChar<= 'z'){
            System.out.println( "it is  a letter case");

        }else {
            System.out.println("it is not a letter case");
        }
    }
}
