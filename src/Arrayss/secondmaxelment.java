package Arrayss;

public class secondmaxelment {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 34, 23};

        int max = arr[0];
        int secmax = arr[0];
        

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }
        }
        

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=max&&arr[i]>secmax){
                secmax = arr[i];
                
            }
        }
        System.out.println(secmax);

    }
    
}
