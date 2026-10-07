// 5.Remove duplicates from a sorted array:

class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Unique elements are from index 0 to i
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
