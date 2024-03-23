import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsexplained {
    public static void main(String[] args) throws Exception {
        readFile("C://Jaya.txt");;

    }
    //Line 13 will take of complete code if any exception comes without writing
    //from line14 to 19
    // throw and throws are different line 17 and line 13 thow- within code throws - complete code
    static void readFile(String fileName) throws Exception {
        File f = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        if(fileName.length() == 0){
            throw new FileNotFoundException();
        }
        System.out.println("Not vulnerable code");
        int a = 10/0;
    }
}
