package Collection;


import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[]args){
        HashMap<Integer,String>  newlist=new HashMap<>();
        newlist.put(101,"a");
        newlist.put(102,"b");
        newlist.put(103,"c");
        newlist.put(104,"d");
        newlist.put(105,"e");

        System.out.println(newlist.get(102));

//        for eachloop
        for(Map.Entry m:newlist.entrySet()){
            System.out.println(m.getKey()+"--"+m.getValue());
        }
    }
}
