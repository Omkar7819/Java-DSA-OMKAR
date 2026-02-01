package Arrayss;

public class rightmoveby1 {
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        int lastelment = arr[arr.length-1];

        for(int i=arr.length-2; i>=0; i--){
        arr[i+1] = arr[i];
        
    }
    arr[0] = lastelment;
    ArraysIO.display(arr);
    }
}
