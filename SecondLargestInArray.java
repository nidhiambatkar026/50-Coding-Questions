public class SecondLargestInArray {
public static void main(String[] args) {
int arr[] = {12, 35, 1, 10, 34, 1};
int largest = arr[0];
int secondLargest = arr[0];
for (int i = 0; i < arr.length; i++) {
if (arr[i] > largest) {
secondLargest = largest;
largest = arr[i];
} else if (arr[i] > secondLargest) {
secondLargest = arr[i];
}
}
System.out.println("The Second largest element in the array is: "+secondLargest);
}
}
