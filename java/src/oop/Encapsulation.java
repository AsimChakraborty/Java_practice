package oop;
class Person{
   private String name;
   int age;
   public void setName(String n) {
       name = n;
   }
   public String getName(){
       return name;
   }

   void display(){
        System.out.println("your name:"+name);
        System.out.println("your age:"+age);
    }
}
public class Encapsulation {
    public static void main(String[]args){
        Person p1=new Person();
        p1.age=12;
        p1.setName("as");
        p1.display();
        System.out.println(p1.getName());
    }
}
