package FileHandling;

import java.io. BufferedReader;
import java.io. FileReader;
import java.io. PrintWriter;

public class MergeTwoFilesLineByLine {

    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter("src/FileHandling/demo/out.txt");
    

        BufferedReader br1 = new BufferedReader(new FileReader("src/FileHandling/demo/F1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("src/FileHandling/demo/F2.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

    while((line1 != null) || (line2 != null)){
        if(line1 != null){
            out.println(line1);
            line1 = br1.readLine();
        }
        if(line2 != null){
            out.println(line2);
            line2 = br2.readLine();
        }
    }
    out.flush();
    out.close();
    br1.close();
    br2.close();
    
    }
}

    