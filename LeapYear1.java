import java.util.Scanner;
public class LeapYear1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("eneter any number");
        int num = input.nextInt();
        System.out.println(((num % 4 == 0 && num % 100 != 0) || (num % 400 ==0))?  " is leapyear" :  " is not leapyear");

    }
}