package Arrayss;

public class polindromofarrya {


        static boolean polinamial(int[] arr){
            int i=0, j=0;

        for(i=0; i<arr.length;i++){
            for(j=arr.length-1; j>=0; j-- ){
                if(arr[i] != arr[j]){
                    boolean pali =  false;
                }
            }

        }return pali;
    }

    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();
        polinamial(arr);

    }
    
}
