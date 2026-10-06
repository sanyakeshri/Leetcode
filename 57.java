// 3.Check if array is sorted:

class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 43, 65, 3, 73, 22};

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {              //If start from '1' then (i< arr.length)
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}