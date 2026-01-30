package Arrayss;
import java.util.Scanner;

public class rightmovebyK {

    public static void bruteForce(int[] arr, int k, int n){
        int j=0;
        int[] temp = new int[k];
        for(int i=n-k; i<n; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }
        
        for(int i=0; i<k; i++){
            arr[i]= temp[i];
        }
        ArraysIO.display(arr);
    }
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        Scanner Sc = new Scanner(System.in);
        int k1 = Sc.nextInt();
        int n = arr.length;

        int k = k1 % n;

        bruteForce(arr, k, n);

    }
    
}
