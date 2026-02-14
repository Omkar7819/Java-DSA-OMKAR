package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class RemoveDuplicatesFromFile {
    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter("src/FileHandling/demo/out.txt");
    

        BufferedReader br1 = new BufferedReader(new FileReader("src/FileHandling/demo/F1.txt"));
        

        String line1 = br1.readLine();
        
        while(line1 != null){
            BufferedReader br2 = new BufferedReader(new FileReader("src/FileHandling/demo/F2.txt"));
            boolean ava = false;
            String target = br2.readLine();

            while(target != null){
                if(target.equals(line1)){
                    ava = true;
                    break;
                }
                target = br2.readLine();
            }
            if(ava == false){
                out.println(line1);
            }
            line1 = br1.readLine();
            out.flush();
        }
        out.close();
        br1.close();   


    } 
}
