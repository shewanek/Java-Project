import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        boolean ly = (num % 2 == 0 && num % 100 != 0) || (num % 400 == 0);
        if(ly){
            System.out.println(num + " is leap year");
        }
        else
        System.out.println(num + " is not leap year");
    }
}