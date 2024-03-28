import java.util.Scanner;

public class ToUpper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char to convert upper");
        char valueChar = input.next().charAt(0);
        int tem;
        tem = (int)(valueChar);
        tem -=  32;
        valueChar = (char)(tem);
        System.out.println("Converted to upper  case " +valueChar);
    }
}
