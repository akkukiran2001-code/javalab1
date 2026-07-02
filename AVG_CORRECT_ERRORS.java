import java.util.Scanner;

public class AVG_CORRECT_ERRORS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 1st number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter 1st number : ");
        int n3 = sc.nextInt();

        float AVG = (n1+n2+n3) / 3;

        System.out.println();
        System.out.print("Average : "+AVG);

    }
}
