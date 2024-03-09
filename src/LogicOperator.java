import java.util.*;
public class LogicOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that divisible by 2 and 3");
        int number = input.nextInt();
        System.out.println("is this" + number + "Divisible by 2 and 3 " +
                ((number % 2 == 0) && (number % 3 == 0)));

        System.out.println("Enter a second number that divisible by 2 or 3");
        int number2 = input.nextInt();
        System.out.println("is this second" + number2 + "Divisible by 2 and 3 " +
                ((number2 % 2 == 0) || (number2 % 3 == 0)));

        System.out.println("Enter a this number that divisible by 2 or 3");
        int number3 = input.nextInt();
        System.out.println("is this third" + number3 + "Divisible by 2 either 3 " +
                ((number3 % 2 == 0) ^ (number3 % 3 == 0)));

    }
}
