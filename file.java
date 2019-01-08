
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteFile {

    /**
     * This class shows how to write file in java
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        //String data = "I will write this String to File in Java";
     //   int noOfLines = 10000;
        writeUsingFileWriter(data);
        
        System.out.println("DONE");
    }

    /**
     * Use FileWriter when number of write operations are less
     * @param data
     */
    private static void writeUsingFileWriter(String data) {
        File file = new File("C:\\newfile.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}