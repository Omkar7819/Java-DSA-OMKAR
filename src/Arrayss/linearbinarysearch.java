package Arrayss;

import java.util.Scanner;
public class linearbinarysearch {

    static int linearSearch(int[] arr, int target){
        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                index = i;
            }

        }
        System.out.println("LLLL:  " + index);
        return index;
    }


    static int binarySearch(int[] arr, int target){
        int index = 0;
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;

        

        

        while(arr[mid]!=target){
            mid = (min+max)/2;
            if(arr[mid]==target){
            index = arr[mid];
        }
            if(arr[mid]<target){
                min =mid+1;
            }
            else if(arr[mid]>target){
                max = min -1;
            }
            else{
                System.out.println("No elment present :");
            }
            index = arr[mid];
        }
        System.out.println("BBBB:  " + index);
        return index;

    }
    public static void main(String[] args) {
        
        
        int[] arr = ArraysIO.input();
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        linearSearch(arr, target);
        binarySearch(arr, target);
    }
    
}
