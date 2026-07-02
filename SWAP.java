import java.util.Scanner;

public class SWAP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Swapping with temporary variable");
        System.out.println("________________________________");

        System.out.print("Enter number 1 : ");
        int A = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int B = sc.nextInt();

        System.out.println();
        System.out.println("Before Swap :");
        System.out.println("A = "+A);
        System.out.println("B = "+B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println();
        System.out.println("After Swap :");
        System.out.println("A = "+A);
        System.out.println("B = "+B);

        System.out.println();
        System.out.println("Swapping without temporary variable");
        System.out.println("________________________________");

        System.out.print("Enter number 1 : ");
        int C = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int D = sc.nextInt();

        System.out.println();
        System.out.println("Before Swap :");
        System.out.println("C = "+C);
        System.out.println("D = "+D);

        C = C+D;
        D = C-D;
        C = C-D;

        System.out.println();
        System.out.println("After Swap :");
        System.out.println("C = "+C);
        System.out.println("D = "+D);

    }
}
