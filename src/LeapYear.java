import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        // create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a leap year");
        int year = input.nextInt();

        // check if the year is leap year
        boolean isLeapyear = (year % 4 ==0 && year % 100 != 0 || year % 400 == 0 );
        // Display the message in dialog box
        System.out.println(year + " is a leap year " + isLeapyear );
    }
}
