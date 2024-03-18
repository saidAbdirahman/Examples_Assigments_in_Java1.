import java.util.Scanner;

public class ConditonalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = input.nextInt();
        int y = (x>1)?1:-1;
        System.out.println(y);
    }
}
