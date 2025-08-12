import java.util.Scanner;

public class thirdlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int N = sc.nextInt();

        System.out.println("Enter Array Element: ");
        int arr[] = new int[N];

        if (N < 3) {
            System.out.println("Array should have at least 3 elements.");
            return;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                thirdLargest = SecondLargest;
                SecondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > SecondLargest && arr[i] != largest){
                thirdLargest = SecondLargest;
                SecondLargest = arr[i];
            }else if(arr[i] > thirdLargest && arr[i] != largest && arr[i] != SecondLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println("Third Largest Element of an array is: "+thirdLargest);
    }
}
