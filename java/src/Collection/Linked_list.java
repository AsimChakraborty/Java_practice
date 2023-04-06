package Collection;

import java.util.LinkedList;

public class Linked_list {
    public static void main(String[]args){
        LinkedList<String>studentlist=new LinkedList<String>();
        studentlist.add("A");
        studentlist.add("B");
        studentlist.add("c");
        studentlist.add(3,"d");
        studentlist.addFirst("bijoy");
        studentlist.addLast("sakib");

        studentlist.remove("B");

        System.out.println("studentlist:"+studentlist);


        for(String names:studentlist){
            System.out.println("studentlist:"+names);
        }
    }
}

