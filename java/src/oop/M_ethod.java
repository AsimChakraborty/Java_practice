package oop;
class Teacher1{
    String name,gender;
    int id;

    void display(){
        System.out.println("your name:"+name);
        System.out.println("your id:"+id);
        System.out.println("your gender:"+gender);
    }
}
public class M_ethod {
    public static void main(String[]args){
        Teacher1 tech=new Teacher1();
        tech.name="sakib";
        tech.gender="m";
        tech.id=12;
        tech.display();
        Teacher1 tech1=new Teacher1();
        tech1.name="tamin";
        tech1.gender="m";
        tech1.id=12;
        tech1.display();

    }
}
