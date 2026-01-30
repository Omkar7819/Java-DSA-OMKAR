package Arrayss;

public class countevenodd {
    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();

        int Ecount = 0;
        int Eodd = 0;


        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                Ecount += 1;
            }else{
                Eodd += 1;
            }
        }
        System.out.println("Even numbers : "+ Ecount);
        System.out.println("odd numbers : "+ Eodd);
    }
    
}
