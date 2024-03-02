import java.util.Scanner;

public class DayOfMeeting {
    public static void main(String[] args) {
        int meetDay, dayofweek;
        final int  WEEKDAYS = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of the meeting ");
        dayofweek = input.nextInt();
        meetDay = (dayofweek + 10)%WEEKDAYS;
        System.out.println(meetDay);
    }
}
