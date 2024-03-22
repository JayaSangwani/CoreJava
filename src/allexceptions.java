import java.sql.SQLOutput;

public class allexceptions {

    public static void main(String[] args) {
        try{
            String ip = args[0];
            int a =Integer.parseInt(args[0]);
            int b =10/a;
            System.out.println(a);
            System.out.println(b);

        //} catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
          //  System.out.println(e.getMessage());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally { //it will be executed no matter what
            System.out.println("I will be executed somehow");
        }
    }
}
