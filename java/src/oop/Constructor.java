package oop;
class Student1{
    String name,gender;
    int age;
    Student1(String n,String g,int a){
        name=n;
        gender=g;
        age=a;
    }

    Student1(String n,String g){   //constructor overloading
        name=n;
        gender=g;
    }
    Student1(){
        System.out.println("no value");
    }
    void display(){
        System.out.println("your name:"+name);
        System.out.println("your gender:"+gender);
        System.out.println("your age:"+age);
    }
}
public class Constructor {
    public static void main(String[]args){
        Student1 abc=new Student1("sakib","m",12);
        abc.display();
        System.out.println("\n\n");
        Student1 abcd=new Student1("sakib","m");
        abcd.display();
        System.out.println("\n\n");
        Student1 abc1=new Student1();
        abc1.display();
    }
}
