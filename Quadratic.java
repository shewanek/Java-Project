import java.util.Scanner;
public class Quadratic{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of each constant");
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        System.out.println();
        double r1,r2;
        if((Math.pow(b,2) - 4*a*c) > 0){
             r1 = (-b + Math.pow(Math.pow(b, 2) - 4*a*c, 0.5))/ (2*a);
             r2 = (-b - Math.pow(Math.pow(b, 2) - 4*a*c, 0.5))/ (2*a);
             System.out.printf(" the roots are %.4f and %.4f \n", r1, r2);
        }
        else if((Math.pow(b,2) - 4*a*c) == 0){
            r1 = -b / (2*a);
            System.out.printf(" the roots are %.4f  \n", r1);
        }
        else
        System.out.println("has no solution");
        java Quadratic < output.txt


    }
}