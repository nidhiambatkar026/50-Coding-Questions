import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int N1 = sc.nextInt();
        System.out.println("Enter the size of array 2: ");
        int N2 = sc.nextInt();
        
        int arr1[] = new int[N1];
        int arr2[] = new int[N2];

        System.out.println("Elements of array 1: ");
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Elements of array 2: ");
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements are: ");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }

    }
}
