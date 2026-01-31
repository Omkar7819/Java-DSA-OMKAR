package Arrayss.TwoDArrayss;

public class sumofallelment {
    public static void main(String[] args) {
        
        int[][] arr = Arrays2DIO.input();

        int cSize = arr[0].length;
        int temp =0;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<cSize; j++){
                temp += arr[i][j];
            }
        }
        System.out.println(" Sum of all elment is :"+temp);
    }
    
}
