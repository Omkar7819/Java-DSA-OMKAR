package Arrayss.TwoDArrayss;

import java.util.*;
public class Arrays2DIO {
    
    static int[][] input(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("   Enter the Size of Rows :");
        int n = Sc.nextInt();
        System.out.print("Enter the Size of Coloums :");
        int m = Sc.nextInt();
        int[][] arr = new int[n][m];


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter the Elemetn at index : "+i+", "+j+"  :");
                arr[i][j] = Sc.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr){
        int rowSize = arr.length;
        int colSize = arr[0].length;

        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        
        int[][] arr = input();
        display(arr);
    }
    
}
