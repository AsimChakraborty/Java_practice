package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[]args){
        ArrayList<Integer> num =new ArrayList<>() ;
        num.add(10);
        num.add(15);
        num.add(2,20);
        System.out.println("arraylist:"+num);

//        for each loop
        for (int temp:num){
            System.out.println("arraylist:"+temp);
        }
        System.out.println("\n\n");
//        iterator
        Iterator itr= num.iterator();
        while (itr.hasNext()){
            System.out.println("arraylist:"+itr.next());
        }

        System.out.println(num.size());
        System.out.println("\n\n");
        System.out.println(num.remove(0));

        System.out.println("After remove:"+num);

        int in= num.indexOf(15);
        System.out.println(in);

        num.set(1,40);
        System.out.println("after added:"+num);


    }
}
