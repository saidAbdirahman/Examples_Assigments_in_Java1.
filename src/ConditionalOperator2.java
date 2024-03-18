import java.util.Scanner;

public class ConditionalOperator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x");
        int num = input.nextInt();
        System.out.print(
                (num % 2== 0)?  num + " is Even" : num + " is Odd"
        );
    }
}
