import java.util.Scanner;

public class PATTERN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number rows for generating the pattern : ");
        int rows = sc.nextInt();

        if(rows < 1){
            System.out.println("Enter a number greater than 0!");
            return;
        }

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
