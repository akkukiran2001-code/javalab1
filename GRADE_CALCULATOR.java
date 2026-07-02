import java.util.Scanner;

public class GRADE_CALCULATOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Mark : ");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100){
            System.out.print("Your grade is A ");
        }
        else if (mark >= 80 && mark <= 89){
            System.out.print("Your grade is B ");
        }
        else if (mark >= 70 && mark <= 79){
            System.out.print("Your grade is C ");
        }
        else if (mark <= 70){
            System.out.print("Your grade is D ");
        }
        else{
            System.out.print("INVALID INPUT!");
        }
    }
}
