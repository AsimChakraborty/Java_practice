class employee {
    int id;
    String name;
    float salary;
    void inset(int i,String n,float m){
        id=i;
        name=n;
        salary=m;
    }
    void display(){
        System.out.println(id+""+name+""+salary);
    }
}
public class testemployee{
       public static void main(String[]args){
        employee s1=new employee();
        s1.inset(10,"sakib",1000);
        s1.display();
    }
}
