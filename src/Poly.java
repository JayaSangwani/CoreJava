public class Poly {
    public static void main(String[] args) {
        System.out.println(Grandfather.a);
        Grandfather gf = new Son();//Dynamic Dispatch
        gf.m1();
        Father f = new Son();//Dynamic Dispatch
        f.say();
        Son s = new Son(); //object for above all should be created from child class
        s.m1();
        s.say();

    }
}

interface Grandfather{
    int a = 10;
    void m1();
}

abstract class Father implements Grandfather{
    abstract void say();
    }

class Son extends Father{

    @Override
    public void m1() {
        System.out.println("m1 is called from son class");
    }

    @Override
    void say() {
        System.out.println("say is called from son class");

    }
}

