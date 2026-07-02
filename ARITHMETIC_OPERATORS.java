import java.util.Scanner;

public class ARITHMETIC_OPERATORS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int diff = num1-num2;
        int pro = num1*num2;

        System.out.println();
        System.out.println("Addition = "+sum);
        System.out.println("Subtraction = "+diff);
        System.out.println("Multiplication = "+pro);

        if(num2 == 0){
            System.out.println();
            System.out.println("DIVISION AND MODULUS CANNOT BE DONE WHEN THE DIVISOR IS 0!");
        }

        int quo = num1/num2;
        int mod = num1%num2;

        System.out.println("Division = "+quo);
        System.out.println("Modulus = "+mod);
    }
}
