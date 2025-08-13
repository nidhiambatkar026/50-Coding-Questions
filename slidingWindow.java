import java.util.Scanner;

public class slidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array: ");
        int N = sc.nextInt();

        int arr[] = new int[N];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter window Size: ");
        int w = sc.nextInt();

        int current = 0;
        for(int i=0; i<w; i++){
            current += arr[i];
        }

        int max = current;
        for(int i=1; i<=N-w; i++){
            current = current - arr[i - 1]+ arr[i+w-1];
            if(current > max){
                max =current;
            }
        }
        System.out.println(max);
    }
}
