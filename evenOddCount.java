import java.util.Scanner;

public class evenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int even = 0;
        int odd = 0;

        int arr[] = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even no of counts are: "+even);
        System.out.println("Odd no of counts are: "+odd);
    }
}
