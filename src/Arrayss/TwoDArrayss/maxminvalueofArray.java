package Arrayss.TwoDArrayss;

public class maxminvalueofArray {
    public static void main(String[] args) {
        int[][] arr = Arrays2DIO.input();

        int cSize = arr[0].length;
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<cSize; j++){
                if(arr[i][j]>max){
                    min = max;
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max value of arrays :"+ max);
        max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<cSize; j++){
                if(arr[i][j]<max&&arr[i][j]!=min){
                    min = arr[i][j];
                }
            }
        }
        
        System.out.println("max value of arrays :"+ min);
    }
    
    
}
