package Arrayss.TwoDArrayss;

public class sumofallelmentinColumn {
    public static void main(String[] args) {
        
        int[][] arr = Arrays2DIO.input();
        Arrays2DIO.display(arr);

        int cSize = arr[0].length;
        
        for(int i=0; i< cSize; i++){
            int temp =0;
            for(int j=0; j<arr.length; j++){

                temp += arr[j][i];
                
                
            }
            System.out.println(" Sum of elment in "+ i +" is :"+temp);
            
        }
        

        
        
    }    
}
