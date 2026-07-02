import java.util.Scanner;

public class LARGEST_NUMBER {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.print("The largest number of Three numbers is : " +n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.print("The largest number of Three numbers is : " +n2);
        }
        else{
            System.out.print("The largest number of Three numbers is : " +n3);
        }
    }
}
