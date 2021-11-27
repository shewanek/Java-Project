public class MultipTable{
    public static void main(String[] shewa){
        System.out.println("\n\n                Multiplication Table");
        System.out.print("\n   ");
        for(int j = 1; j <=9;j++)
        System.out.printf("%4d", j);
        System.out.println(" ");
        System.out.println("________________________________________");
        for(int i = 1; i<= 9;i++){
            System.out.print(i + " |");
            for(int j = 1; j<= 9;j++){
                System.out.printf("%4d",i * j );
            }
            System.out.println(" ");
        }

    }
}