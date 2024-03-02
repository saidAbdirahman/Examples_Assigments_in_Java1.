

import java.util.*;
public class GenerateTest {
    public static void main(String[] args) {
        int num = (int) System.currentTimeMillis()%10;
        System.out.println("Enter a guess number ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if ( num == answer){
            System.out.println("You are correct and generated num is " + num );

        } else if (num < answer) {
            System.out.println("it is greater than and the generated num is " + num);
        } else if (num > answer){
            System.out.println("It is less than and generated num is " + num);

        }

    }
}
