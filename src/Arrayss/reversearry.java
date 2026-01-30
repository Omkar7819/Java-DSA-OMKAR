package Arrayss;

class reversearry {

    
    static int[] input(int[] arr, int j, int k) {
        
        int[] arr1 = new int[arr.length];   
        for(int i=arr.length-1; i>=0; i--){
            arr1[j++] = arr[i];
        }
        return arr1;
        
    }

    static int[] display(int[] arr){
        ArraysIO.display(arr1);
        return arr1;
    }
    
}
