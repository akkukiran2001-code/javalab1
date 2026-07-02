import java.util.Scanner;

public class MULTIPLICATION_TABLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i =1;i<11;i++){
            System.out.println("7 x "+i+" = "+(n*i));
        }
    }
}
