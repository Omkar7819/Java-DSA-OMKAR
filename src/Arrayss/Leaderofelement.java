package Arrayss;

public class Leaderofelement {

    // static int[] Leader(int[] arr){
    //     int i=0;
    //     int max = arr[0];
    //     for(i=0; i<arr.length; i++){
    //         if(arr[i]>max){
    //             max = arr[i];
    //         }
    //     }
    //     int[] arr1 = {i, max};
    //     System.out.println("hello Leader of elment are");
    //     if(max==arr[arr.length-1]){
    //         System.out.println(max);
    //     }else{

    //     }

    //     return arr1;
    // }



    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        
        // int[] Maxx =Leader(arr);
        int Max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= Max){
                System.out.println(arr[i]);
                Max = arr[i];
            }
        }
        
        
            

    }
    
}
