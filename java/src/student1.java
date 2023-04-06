public class student1 {
    int id;
    String name;

    void insertrecord(int r, String m) {
        id = r;
        name = m;
    }

    void display() {
        System.out.println(id + "" + name);
    }
}
class teststudent4{
           public static void main(String[]args){
            student1 s1=new student1();
            s1.insertrecord(11,"sakib");
            s1.display();
        }
}

