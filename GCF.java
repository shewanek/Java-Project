public class GCF{
    public static void main(String[] shewa){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int gcf = 1;
        int k = 2;
        System.out.println("enter two number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for( k = 2;k <= num1 && k <= num2; k++){
            if(num1 % k == 0 && num2 % k == 0){
                gcf = k;
            }
        }
        System.out.println("the GCF of "+ num1 + " and " + num2 + " = " +gcf);
    }
}