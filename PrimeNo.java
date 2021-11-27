public class PrimeNo{
    public static void main(String[] shewanek){
        int count = 0;
        int number = 2;
        while(count < 100){
            boolean isprime = true;
            for(int divsor = 2; divsor <= number / 2; divsor++){
                if(number % divsor == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                count++;
                if(count % 10 == 0){
                    System.out.printf("%6d\n",number);
                }
                else
                System.out.printf("%6d",number);
            }
            number++;
        }
    }
}