import java.util.Scanner;

public class SIMPLE_INTEREST {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Principle Amount : ");
        int P = sc.nextInt();

        System.out.print("Enter the Interest rate (In Percentage) : ");
        float R = sc.nextFloat();
        R = R%100;

        System.out.print("Enter the Time : ");
        int T = sc.nextInt();

        if (P==0 || R==0 || T==0){
            System.out.println("INVALID INPUT!");
        }
        else{
            float simple_interest = (R*P*T) / 100;

            System.out.println("Simple Interest : "+simple_interest);
            System.out.print("Amount : "+ (P+simple_interest));
        }
    }
}