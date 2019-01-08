import java.io.FileInputStream;
import java.io.FileOutputStream;  
import java.io.FilterInputStream;
public class FileOutputStreamExample {  
    public static void main(String args[])throws Exception{
             
           try{
                 int i;     
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); 
             FileInputStream fin=new FileInputStream("D:\\newfile.txt"); 
             while((i=fin.read())!=-1)  
               {
             System.out.print((char)i); 
                  }
             fin.close();
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  