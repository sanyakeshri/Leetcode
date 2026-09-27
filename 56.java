// Array basics question from (56-76):
// Largest elemenmt in an array:

class Solution{
    public static void main(String[] args) {
        int[] arr = {2,5,11,3,0};
        int largest = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
            System.out.println("Largest element is: " + largest);
    }
}