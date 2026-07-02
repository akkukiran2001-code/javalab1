import java.util.Scanner;

public class SUM_DIGITS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int sum = 0;
        int rem = 0;

        while (num != 0) {
            rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum of digits is : "+sum);
    }
}
