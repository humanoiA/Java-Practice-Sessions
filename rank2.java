class A extends Thread
{
    int i;
    public void run() {
        for(i=0;i<10;i++)
        {
            System.out.println(i);
        }
        try {
            sleep(1000);      
        } catch (Exception e) {
            //TODO: handle exception
        }
      
    
    }
    
}
class M
{
    public static void main(String[] args) {
        A h =new A();
        h.start();
        A k = new A();
        k.start();
    }
}