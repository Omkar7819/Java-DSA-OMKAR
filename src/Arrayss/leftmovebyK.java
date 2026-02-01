package Arrayss;

import java.util.Scanner;
public class leftmovebyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArraysIO.input();
        int k1 = sc.nextInt();
        
        int k = k1%arr.length;
        int[] temp = new int[k];
        int n= arr.length;

        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=k; i<n; i++){
            arr[i-k] = arr[i];
        }

        int j=0;
        for(int i=n-k; i<n; i++){
            arr[i] = temp[j];
            j++;
        }
        // reversearry.input(arr, 0, k);
        // reversearry.display(arr);
        // ArraysIO.display(arr);

        sc.close();
        ArraysIO.display(arr);
    }


    
}
