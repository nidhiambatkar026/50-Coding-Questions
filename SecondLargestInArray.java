import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int SecondLargest = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > SecondLargest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is: "+SecondLargest);
    }
}