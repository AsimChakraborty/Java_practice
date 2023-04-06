package oop;
class Student{
    String name,gender;
    int id;
   void setinformation(String n,String g,int i){
       name=n;
       gender=g;
       id=i;
   }
    void display(){
        System.out.println("your name:"+name);
        System.out.println("your gender:"+gender);
        System.out.println("your id:"+id);
    }
}
public class parametrized_method {
   public static void main(String[]args){
       Student abc=new Student();
       abc.setinformation("sakib","m",12);
       abc.display();
   }
}
