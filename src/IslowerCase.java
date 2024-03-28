import java.util.*;
public class IslowerCase {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a Char? : ");
        char valueChar= input.next().charAt(1);
        //is lower case
        if('a' <= valueChar && valueChar<= 'z'){
            System.out.println( "it is  lower case");

        }else {
            System.out.println("it is not lower case");
        }
    }
}
