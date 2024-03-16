import java.sql.SQLOutput;

public class StaticVariable_Function {

    public static String college_name = "SHGC"; //static variable

    public int version = 10; //instance variable

    public static void printname(){ //static function/method
        System.out.println("CollegeName is :"+college_name);
        //this. function is not allowed in static ex. this.collegename
        //System.out.println("version"+version);
        //instance/non-static variable is not allowed in static method

    }

    public void printversion(){ //non-static function/method
        System.out.println("Version is :" +version);
        System.out.println("College" +college_name);
        //static variable is allowed in instance/non-static method

    }
}
