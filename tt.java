class Student{  
int rollno;  
String name,course;  
float fee;  
Student(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis7{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit","java",0.0f);  
Student s2=new Student(112,"sumit","java");  
s1.display();  
s2.display();  
}
}  