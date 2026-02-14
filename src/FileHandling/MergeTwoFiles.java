package FileHandling;

import java.io. BufferedReader;
import java.io. FileReader;
import java.io. PrintWriter;

public class MergeTwoFiles {

    public static void main(String[] args) throws Exception{
        PrintWriter out = new PrintWriter("src/FileHandling/demo/out.txt");
    

        BufferedReader br1 = new BufferedReader(new FileReader("src/FileHandling/demo/F1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("src/FileHandling/demo/F2.txt"));

        String line = br1.readLine();
        

    while((line != null)){
        out.println(line);
        line = br1.readLine();

    }
    line = br2.readLine();
    while((line != null)){
        out.println(line);
        line = br2.readLine();
    }
    out.close();
    br1.close();
    br2.close();
    
    }
}

    
