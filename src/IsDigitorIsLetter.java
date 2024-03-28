import java.util.Scanner;

public class IsDigitorIsLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a latter or digit");
        char NumOrDigit = input.next().charAt(0);
        if('A' <= NumOrDigit && NumOrDigit <= 'Z' || 'a' <= NumOrDigit && NumOrDigit <= 'z'){
            System.out.println("is a latter");
        } else if ('0' <= NumOrDigit && NumOrDigit <= '9') {
            System.out.println("is a Digit");

        } else {
            System.out.println("It is not number nor letter ");
        }
    }
}
