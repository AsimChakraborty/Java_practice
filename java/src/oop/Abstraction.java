package oop;

abstract class Mobileuser{
    void call(){     //non abstarct method
        System.out.println("call method");
    }
    abstract void sendmessage();  //abstract method
}

class Rahim extends Mobileuser{
    @Override
    void sendmessage() {
        System.out.println("hi my name is rahim");
    }
}
class Sakib extends  Mobileuser{
    @Override
    void sendmessage() {
        System.out.println("my name is sakib");
    }
}
public class Abstraction {
    public static void main(String[] args) {
      Mobileuser ms;
      ms=new Rahim();
      ms.sendmessage();
      ms.call();

      ms=new Sakib();
      ms.sendmessage();

    }
}
