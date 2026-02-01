package Arrayss;

class reversearry {
    public static void main(String[] args) {
        
         int[] arr = ArraysIO.input();
        // int[] arr1 = new int[arr.length];   
        // int j = 0;
        // for(int i=arr.length-1; i>=0; i--){
        //     arr1[j++] = arr[i];
        // }
        // ArraysIO.display(arr1);


        int start = 0, end = arr.length - 1;


        while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
         
        }
        ArraysIO.display(arr);
    }
}
