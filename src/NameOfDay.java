import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Day Name");
        String dayName = input.next();
        switch(dayName) {
            case "sabti":
                System.out.println("sabti");
                break;
            case "sunday":
                System.out.println("sunday");
                break;
            case "monday":
                System.out.println("monday");
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            case "thursday":
                System.out.println("thursday");
                break;
            case "friday":
                System.out.println("friday");
                break;
        }


    }
}
