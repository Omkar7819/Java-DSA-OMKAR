package Arrayss;

import java.util.Scanner;

public class sumofelmentarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        int sum = 0;

        for(int i=0; i<size; i++){
            System.out.print("Enter the elment at Index :" +i+ "  ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
                sum += arr[i];
        }
        System.out.println("Sum of Array is :"+sum);
    }
    
}
