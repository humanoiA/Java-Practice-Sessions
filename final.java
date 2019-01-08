  import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.*;;
class finale
{
    public static String meth(String fileName)throws Exception
    {
      String data = "";
      data = new String(Files.readAllBytes(Paths.get(fileName)));
      return data;
    }
    public static void main(String[] args) throws Exception {
        String sta = meth("D:\\A.txt");
        String stb = meth("D:\\B.txt");
    
        String[] s1 = sta.split(" ");
        String[] s2 = stb.split(" ");

        String t="";
  //      String y="";
        StringBuffer dua = new StringBuffer(t);
   //     StringBuffer dua2 = new StringBuffer(y);
        for(String s : s1){
            for(String ss : s2){
            if(ss.equals(s)){
                dua.append(" "+s);
                }
            }
        }
        try (PrintWriter out = new PrintWriter("D:\\C.txt")) {
            out.println(dua);
            out.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}