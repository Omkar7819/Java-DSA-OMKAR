package Arrayss.TwoDArrayss;

public class sumoftwo2darrays {
    public static void main(String[] args) {
        
        int arr1[][] = Arrays2DIO.input();
        int arr2[][] = Arrays2DIO.input();

        int n = arr1.length;
        int m = arr2.length;


        int result[][] = new int[n][m];

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        Arrays2DIO.display(result);   
    }
}
