package Arrayss;

public class leftmoveby1 {
    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();
        
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        ArraysIO.display(arr);
    }
    
}
