public class Casting {
    public static void main(String[] args) {
        //Parent p = new Parent();
        //child c = new child();
        //p = c;
        //c = p ; not allowed

        Hello hel = new child2();
        Hello hello2 = new Hello();

        child2 hai = (child2)hel;//Downcasting in class
        child2 hai2 = (child2)hello2;//Downcasting in class
    }
}
class Hello{

}
class child2 extends Hello{

}

class Parent{}

class child extends Parent{}
