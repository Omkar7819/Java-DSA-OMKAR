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
        System.out.println("Linear Search element not found");
        return -1;
    }


    static int binarySearch(int[] arr, int target){
        
        int min = 0;
        int max = arr.length-1;
    
        while(min<max){
            int mid = (min+max)/2;

            if(arr[mid]==target){
                System.out.println("BBBB:  " + mid);
                return mid;
            }

            if(arr[mid]<target){
                min =mid+1;
            }

            else{
                max = mid -1;
            }
            
        }
        System.out.println("Binary Search elment not found");
        return -1;

    }
    public static void main(String[] args) {
        
        
        int[] arr = ArraysIO.input();
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        linearSearch(arr, target);
        binarySearch(arr, target);
    }
    
}
