import java.util.Scanner;

public class MAX_ELEMENT_ARRAY {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        if (n<=0){
            System.out.println("INVALID INPUT!");
        }

        int[] array = new int[n];

        for(int i = 0;i<n;i++){
            System.out.print("Enter Element " +(i+1)+" : ");
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for(int i = 1;i<n;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println();
        System.out.println("Maximum element in the array is : "+max);
    }
}
