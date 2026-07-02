import java.util.Scanner;

public class SALARY_CALCULATOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float DA = 0.1f;
        float HRA = 0.15f;

        System.out.print("Enter your Base Salary : ");
        int base_salary = sc.nextInt();

        if(base_salary <=0){
            System.out.println("Enter the valid Salary Amount!");
        }
        else {
            float gross_salary = base_salary + (HRA * base_salary) + (DA * base_salary);
            System.out.println();
            System.out.println("Your Gross Salary is : " + gross_salary);
        }
    }
}
