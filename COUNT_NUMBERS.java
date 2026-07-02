import java.util.Scanner;

public class COUNT_NUMBERS {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        if (n<=0){
            System.out.println("TO ENTER ELEMENTS INTO AN ARRAY YOU HAVE TO SPECIFY HOW MAY ELEMNTS ARE THERE IN THE ARRAY!!");
        }

        int[] array = new int[n];

        for(int i = 0;i<n;i++){
            System.out.print("Enter Element " +(i+1)+" : ");
            array[i] = sc.nextInt();
        }

        int P=0,N=0,Z=0;

        for(int i = 0;i<n;i++){
            if(array[i] > 0){
                P ++;
            }
            else if(array[i] < 0){
                N ++;
            }
            else{
                Z ++;
            }
        }

        System.out.println();
        System.out.println("Positive Numbers = "+P);
        System.out.println("Negative Numbers = "+N);
        System.out.println("Zeros = "+Z);
    }
}
