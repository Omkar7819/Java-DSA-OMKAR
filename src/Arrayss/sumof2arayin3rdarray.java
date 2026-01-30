package Arrayss;

import java.util.Scanner;




public class sumof2arayin3rdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of 1st and 2nd  Array:");
        // int size = sc.nextInt();

        

        // int[] arr1 = new int[size];
        // int[] arr2 = new int[size];

        // int[] arr3 = new int[size];
        

        // for(int i=0; i<size; i++){
        //     System.out.print("Enter the elment at Index for Array 1:" +i+ "  ");
        //     arr1[i] = sc.nextInt();
        //     System.out.print("Enter the elment at Index for Array 2:" +i+ "  ");
        //     arr2[i] = sc.nextInt();
        //     System.out.println();

        // }
        
        // for(int j=0; j<size; j++){
        // arr3[j] = arr1[j]+arr2[j];
        // System.out.println("Array3 elment of sum of Array1 and Array2 is :");
        // System.out.println("at index  "+j+"    " +"sum is :" +arr3[j]);
        // }


            int[] arr1 = ArraysIO.input();
            int[] arr2 = ArraysIO.input();

            int[] arr3 = new int[arr1.length];
            for(int i=0; i<arr1.length; i++){
                arr3[i] = arr1[i]+arr2[i];
            }
            System.out.println("Sum of two arrays is:");
            ArraysIO.display(arr3);

            sc.close();

    }
    
    
}
