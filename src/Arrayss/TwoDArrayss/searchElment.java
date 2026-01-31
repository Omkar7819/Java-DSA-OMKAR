package Arrayss.TwoDArrayss;

import java.util.Scanner;
public class searchElment {

    public static void main(String[] args) {
        


        int[][] arr = Arrays2DIO.input();
        int colSize = arr[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elment to be search  :");
        int target = sc.nextInt();


        Arrays2DIO.display(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<colSize; j++){
                if(target==arr[i][j]){
                    System.out.print("Elment found at index is (i, j) : ("+i+","+j+")");
                }else{
                    System.out.println("Elment is not found");
                }
                
            }
        }
        sc.close();
    }
    
    
}
