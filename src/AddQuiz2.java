import java.util.Scanner;

public class AddQuiz2 {
    public static void main(String[] args) {
        int num1 = (int) System.currentTimeMillis()%10;
        int num2 = (int) System.currentTimeMillis()/10%10;

        System.out.println("What is " + num1 + " + " + num2 + " ?");

        Scanner input = new Scanner(System.in);
        int answer =input.nextInt();
        if (num1 + num2 == answer){
            System.out.println("Your are Correct");
        } else {
            System.out.print(num1 + " + " + num2 + " is Incorrect the answer should be " + answer + " is "
            );
            System.out.println( ( num1 + num2 == answer));
            System.out.println("Please try again by entering ");
            int i = answer;
            while(num1 + num2 != i){
                System.out.println("try again");
                answer = input.nextInt();
                i++;


            }
        }
    }
}
