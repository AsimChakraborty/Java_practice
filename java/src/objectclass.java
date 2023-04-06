public class objectclass {
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
class teststudent5{
        public static void main(String[]args){
            objectclass s1=new objectclass();
            s1.insertrecord(11,"sakib");
            s1.display();
        }
    }

