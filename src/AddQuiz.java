import java.util.*;
public class AddQuiz {
    public static void main(String[] args) {
        int num1 = (int) System.currentTimeMillis()%10;
        int num2 = (int) System.currentTimeMillis()/10%10;

        System.out.println("What is " + num1 + " + " + num2 + " ?");

        Scanner input = new Scanner(System.in);
        int answer =input.nextInt();

        System.out.print(num1 + " + " + num2 + " = " + answer + " is "
       );
        System.out.println( ( num1 + num2 == answer));
    }
}
