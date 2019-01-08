import java.io.FileInputStream;
import java.io.FileOutputStream;  
import java.io.FilterInputStream;
public class mole {  
    public static void main(String args[])throws Exception{
             
           try{
                 int i;  
                 String name = "D:\\D.txt";
             FileWriter fw = new FileWriter(name);
 
            // fw.write("the first test exp");
             fw.close();
            
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); 
             
             while((i=fin.read())!=-1)  
               {
             System.out.print((char)i); 
                  }
             fin.close();
               
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  