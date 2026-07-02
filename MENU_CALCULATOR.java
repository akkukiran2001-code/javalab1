import java.util.Scanner;

public class MENU_CALCULATOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Operations");
        System.out.println("----------");
        System.out.println();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();

        System.out.print("Enter an Operation (1-4) : ");
        int op = sc.nextInt();

        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        switch(op){
            case 1 :
                System.out.println("Sum = "+(num1+num2));
                break;

            case 2 :
                System.out.println("Difference = "+(num1-num2));
                break;

            case 3 :
                System.out.println("Product = "+(num1*num2));
                break;

            case 4 :
                if(num2 == 0){
                    System.out.println("DIVISION CANNOT BE DONE BECAUSE DIVISOR IS ZERO!");
                }
                else{
                    System.out.println("Quotient = "+(num1/num2));
                }
                break;

            default :
                System.out.println();
                System.out.println("INVALID CHOICE!");
        }
    }
}
