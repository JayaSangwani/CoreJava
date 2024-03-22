import java.io.FileInputStream;

public class checkedexception {
    public static void main(String[] args) {
        //checked exception means the one which JVM already knows
        //unchecked exception is not known by JVM


        //Below is example of unchecked exception as it is not showing any error
        String name = null;
        name.trim();


        //its checked exception as it is showing error which clearly identify that its an know error by jvm
        //FileInputStream f = new FileInputStream("jaya.txt");

        //we can use try catch to rectify
    }
}
