import java.util.*;
public class Assigment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mathmatical symbol * + - /");
        String symbol = input.nextLine();
        switch(symbol) {
            case "+":
                System.out.println("enter two numbers to add");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int result = num1 + num2;
                System.out.println("addition is " + result);
                break;
            case "-":
                System.out.println("enter two numbers to subtract");
                int num3 = input.nextInt();
                int num4 = input.nextInt();
                int subresult = num3 - num4;
                System.out.println("subtraction is " + subresult);
                break;
            case "*":
                System.out.println("enter two numbers to multiply");
                int num5 = input.nextInt();
                int num6 = input.nextInt();
                int multiresult = num5 * num6;
                System.out.println("multiplication is " + multiresult);
                break;
            case "/":

                System.out.println("enter two numbers to multiply");
                int num7 = input.nextInt();
                int num8 = input.nextInt();

                if (num8 != 0){
                    int divresult = num7 / num8;
                    System.out.println("Division is " + divresult);
                } else {
                    System.out.println("num 2 is 0");
                }

                break;

        }
    }
}
