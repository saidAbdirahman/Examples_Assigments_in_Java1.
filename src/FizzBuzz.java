import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number greater than 0");
        int num = input.nextInt();

        if (num > 0) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println("Fizzbuzz");

            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("buzz");
            }
        }
    }   }
