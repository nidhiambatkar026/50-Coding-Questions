import java.util.Scanner;

public class twosum {

    public static int[] twoSum(int[] nums, int target) {
         for(int i=0;i < nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
         }
         return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int N = sc.nextInt();

        int nums[]  = new int[N];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int result[]= twoSum(nums, target);
        if (result != null) {
            System.out.println( result[0] + "," + result[1]);
        } else {
            System.out.println("No pair found.");
        }


    }
}
