package Arrayss.TwoDArrayss;


public class transfomationofARRAYs {
    public static void main(String[] args) {
        
        int[][] arr = Arrays2DIO.input();
        int colSize = arr[0].length;

        Arrays2DIO.display(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<colSize; j++){
                arr[i][j] = arr[j][i];
                
            }
        }
        Arrays2DIO.display(arr);
       
    }
    
}
