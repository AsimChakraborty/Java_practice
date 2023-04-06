package oop;
class Teacher{
    String name,gender;
    int id;
}
public class C_lass_object {
    public static void main(String[]args){
        Teacher teacher1=new Teacher();
        teacher1.name="sakib";
        teacher1.id=12;
        teacher1.gender="m";
        System.out.println("your name:"+teacher1.name);
        System.out.println("your id:"+teacher1.id);
        System.out.println("your gender:"+teacher1.gender);

    }
}
