package Arrayss;

public class polindromofarrya {


        static boolean polinamial(int[] arr){
            int i=0; 
            int j=arr.length-1;

        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();
        if(polinamial(arr)){
            System.out.println("polindrom");
        }else{
            System.out.println("not polindrom");
        }

    }
    
}
