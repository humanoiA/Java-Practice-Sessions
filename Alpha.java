//import java.io.FileReader;
import java.io.FileWriter;

public class Alpha
{
    public static void main(String[]args)
    {
        try
        {
            String name = "D:\\D.txt";
            FileWriter fw = new FileWriter(name);
//            FileReader fr = new FileReader("D:\\testout.txt");

            fw.write("the first test exp");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}