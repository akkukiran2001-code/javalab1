import java.util.Scanner;

public class DEMO_DATA_TYPE {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter any integer number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter any long integer number : ");
        long num2 = sc.nextLong();

        System.out.print("Enter any Float number : ");
        float num3 = sc.nextFloat();

        System.out.print("Enter any double float number : ");
        double num4 = sc.nextDouble();

        System.out.print("Enter any Character : ");
        char character = sc.next().charAt(0);

        System.out.print("Enter true / False : ");
        boolean bool = sc.nextBoolean();

        System.out.println("Integer Value : "+num1);
        System.out.println("Long Value : "+num2);
        System.out.println("Float Value : "+num3);
        System.out.println("Double Value : "+num4);
        System.out.println("Character Value : "+character);
        System.out.println("Boolean Value : "+bool);
    }
}
