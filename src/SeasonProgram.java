import java.util.*;
public class SeasonProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int month = input.nextInt();
        if(month >= 1 && month <= 12){
            if(month <3 ){
                System.out.println("This month is between 1-3 and its winter " + month);
            } else if (month < 6) {
                System.out.println("This month is between 4-6 and its spring " + month);
            } else if (month < 9) {
                System.out.println("This month is between 7-9 and its Summer " + month);
            } else  {
                System.out.println("This month is between 10-12 and its Autumn " + month);
            }
        } else {
            System.out.println("Please Enter a number between 1-12");

                month = input.nextInt();


        }
    }
}
