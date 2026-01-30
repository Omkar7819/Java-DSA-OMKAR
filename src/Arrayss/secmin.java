package Arrayss;

public class secmin {
    public static void main(String[] args) {
    
        int[] arr = ArraysIO.input();
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        // int tmin = Integer.MAX_VALUE;



        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]<min){
        //         secmin = min;
        //         min = arr[i];
        //     }
        // }
        

        // for(int i=1; i<arr.length; i++){
        //     if(arr[i]!=min&&arr[i]<secmin){
        //         secmin = arr[i];
                
        //     }
        // }




        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                // tmin = secmin;
                secmin = min;
                min = arr[i];
            }else if(arr[i]!=min&&arr[i]<secmin){
                // tmin = secmin;
                secmin = arr[i];
            }
            // else if(arr[i]!=min&&arr[i]!=secmin&&arr[i]<tmin){
            //     tmin = arr[i];
            // }                
        }
        // System.out.println(min +"     "+ secmin +"     "+ tmin);
        System.out.println("Second minimum element is: " + secmin);
    }
    
}
