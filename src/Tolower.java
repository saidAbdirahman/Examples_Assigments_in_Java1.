import java.util.Scanner;

public class Tolower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char to convert lower");
        char valueChar = input.next().charAt(0);

        int char1 = (int)(valueChar);
        char1 +=  32;
        valueChar = (char)(char1);
        System.out.println("Converted to upper  case " +valueChar);
    }
}
