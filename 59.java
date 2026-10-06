// Second largest element:

class Solution{
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};
        
        int largest = Integer.MIN_VALUE;         //means the smallest value an int can store.
        int secondlargest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("secondlargest:" + secondlargest);
    }
}