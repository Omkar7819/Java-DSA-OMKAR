package Arrayss;

import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = sc.nextInt();

        int[] arr1 = new int[size];


        for(int i=0; i<size; i++){
            System.out.println("Enter the elment at Index :" +i);
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr1[i]+" ");
        }

    }
    
}
