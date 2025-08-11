import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end =arr.length-1;

        while(start < end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse array is: "+Arrays.toString(arr));
        
    }
}
