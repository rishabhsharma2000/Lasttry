
public class reverseGivenIndex {
    public static void rotateByLoc(int arr[], int loc) {
        reverse(arr, loc, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 7, 4, 2, 8, 9, 1 };
        rotateByLoc(arr, 3);
    }
}
