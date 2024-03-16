public class Interface {
    public static void main(String[] args) {
        //Calling directly using class name as you dont have to create an object for static variable
        System.out.println(H.a);
        Jaya J = new Jaya();
        J.m1();

    }
}

interface H{ //interface doesnot have any object
    //variables called in interface are
    // "STATIC VARIABLES ONLY"
    int a = 10;
    int b = 20;

    void m1(); //incomplete function and function m1 is not static


}

// how to complete an incomplete function
class Jaya implements H{

    @Override
    public void m1() {
        System.out.println("m1 is called");
    }
}