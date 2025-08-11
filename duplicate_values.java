//Program to find duplicates values of an array

import java.util.Scanner;

public class duplicate_values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean foundelemet = false;
        System.out.println("Duplicate elements are: ");

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    foundelemet = true;
                    break;
                }
            }
        }

        if(!foundelemet){
            System.out.println("Duplicate element not found");
        }
    }
}
