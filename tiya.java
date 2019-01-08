class test{  
    int b;  
    String g;  
    test(int i,String n){  
    b = i;  
    g = n;  
    }  
      
    test(test s){  
    b = s.b;  
    g =s.g;  
    }  
    void display(){System.out.println(b+" "+g);}  
   
    public static void main(String args[]){  
    test s1 = new test(676758,"Ghora");  
    test s2 = new test(s1);  
    s1.display();  
    s2.display();  
   }  
}  