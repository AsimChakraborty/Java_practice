package oop;
class Return{
    int square(int n){
        return n*n;
    }
}
public class Return_value_from_method {
    public static void main(String[]args){
        Return abc=new Return();
        abc.square(5);

    }
}
