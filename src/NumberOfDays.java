import java.util.*;
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number btw 1-12");
        int month = input.nextInt();
        if (month > 0 && month <=12){
            switch (month){
                case 1:
                    System.out.println("31days");
                    break;
                case 2:
                    System.out.println("Enter a year");
                    int year = input.nextInt();
                    if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ){
                        System.out.println("29days");
                } else {
                        System.out.println("28days");
                    }
                    break;
                case 3:
                    System.out.println("31days");
                    break;
                case 4:
                    System.out.println("30days");
                    break;
                case 5:
                    System.out.println("31days");
                    break;
                case 6:
                    System.out.println("30days");
                    break;
                case 7:
                    System.out.println("31days");
                    break;
                case 8:
                    System.out.println("31days");
                    break;
                case 9:
                    System.out.println("30days");
                    break;
                case 10:
                    System.out.println("31days");
                    break;
                case 11:
                    System.out.println("30days");
                    break;
                case 12:
                    System.out.println("31days");
                    break;
            }
        }
    }
}
