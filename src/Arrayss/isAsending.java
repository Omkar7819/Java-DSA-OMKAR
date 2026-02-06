package Arrayss;

public class isAsending {

    public static boolean isAsendingg(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();
        boolean ans = isAsendingg(arr);
        if(ans){
            System.out.println("Asending");
        }else{
            System.out.println("Not Asending");
        }
        
    }
    
}