package Arrayss;

public class meargetwoarrays {
    public static void main(String[] args) {
        
        int[]  arr1 = ArraysIO.input();
        int[]  arr2 = ArraysIO.input();
        int n = 0;
        

        int[]  arr3 = new int[arr1.length+arr2.length];

        int i=0, j=0, k=0;

        while(i<arr1.length&&j<arr2.length){ 
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                
            }else{
                arr3[k] = arr2[j];
                j++;
                
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++; k++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++; k++;
        }
        ArraysIO.display(arr3);
    }
    
}
