package Arrayss;

public class isAsending {
    public static void main(String[] args) {
        
        int[]  arr = ArraysIO.input();
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                System.out.println("Array is in ascending order");
                break;
            }else{
                System.out.println("Array is not in ascending order");
                break;
                
            }
        }
        
    }
    
}