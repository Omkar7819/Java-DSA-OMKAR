package Arrayss;

import java.util.Scanner;

class ArraysIO {

    static int[] input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i+ " index   elment :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        // for(int i = 0; i < arr.length; i++){
        //     int x = arr[i];
        //     System.out.print(x + " ");
        // }

    }
}

