import java.util.*;
public class Lottory{
    public static void main(String[] args){
        int lottory = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("enter your guess");
        int guess = input.nextInt();
        int lottoryDigit1 = lottory / 10;
        int lottoryDigit2 = lottory % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10; 
        if(lottory == guess){
            System.out.println(" you have got it, You are the winner");
        }
        else if((lottoryDigit1 == guessDigit2) && (lottoryDigit2 == guessDigit1)){
            System.out.println("your digit is much with lottory");
        }
        else if(lottoryDigit1 == guessDigit2 || lottoryDigit1 == guessDigit1 || lottoryDigit2 == guessDigit1 || lottoryDigit2 == guessDigit2){
            System.out.println("you much one digit");
        }
        else
        System.out.println("no mutch");
        System.out.println("The lottory nummber is " + lottory);
        
    }
}