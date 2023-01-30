
public class largestNumber {
    public static void getLargest(int arr[]) {
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 23, 76, 34 };
        getLargest(arr);
    }
}
