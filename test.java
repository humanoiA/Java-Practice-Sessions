import java.util.Scanner;  
class test{
    public static void main(String[] args){   
        Scanner sc=new Scanner(System.in);  
            System.out.println("Enter text:");  
            String y = sc.nextLine();
            int flag=0;
           char bin[] = new char[y.length()];
            bin = y.toCharArray();

           int count=0,temp=0; 
            for(int k=0;k+1<bin.length;k++)
            {

                if((bin[k]=='1' )&& (bin[k+1]=='1')){
                    temp++;
                }
                else{
                    if(temp>count){
                        count=temp;
                    }
                temp=0;
                }
            }
            count++;
            System.out.println(" Max Frequency of 1-"+count+"\nAt position-");
            StringBuffer s= new StringBuffer("1");
            for(int i=0;i<count-1;i++)
            {
                s.append('1');
            }
            String a=s.toString();
            System.out.println(y.indexOf(a));
        }    
    }