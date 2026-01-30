package Arrayss;

public class isAsending {
    public static boolean  main(String[] args) {
        
        int[]  arr = ArraysIO.input();
        for(int i=arr.length; i<0; i++){
            if(arr[i]>=arr[i-1]){
            }else{
                
                return false;
                
            }
        }

    }
    
}