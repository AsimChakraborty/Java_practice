
class test{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void display(){
        System.out.println(length*width);
    }
}
public class rectangle {
    public static void main(String[]args){
       test s1=new test();
       s1.insert(40,20);
       s1.display();
    }
}
