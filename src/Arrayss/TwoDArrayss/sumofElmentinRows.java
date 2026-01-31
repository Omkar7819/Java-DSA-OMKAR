package Arrayss.TwoDArrayss;

public class sumofElmentinRows {
    
    public static void main(String[] args) {
        
        int[][] arr = Arrays2DIO.input();
        Arrays2DIO.display(arr);

        int cSize = arr[0].length;
        
        for(int i=0; i< arr.length; i++){
            int temp =0;
            for(int j=0; j<cSize; j++){

                temp += arr[i][j];
                
                
            }
            System.out.println(" Corresponding elment sum is :"+temp);
            
        }
        

        
        
    }
    
}


