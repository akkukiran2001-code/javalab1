import java.util.Scanner;

public class SORT_ARRAY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();

        if(n<1){
            System.out.println("Enter size of array greater than 0!");
            return;
        }

        int[] array = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }

        System.out.println("ARRAY BEFORE SORTING : ");

        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("ARRAY AFTER SORTING : ");

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}