public class exception {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
            System.out.println("I am jaya");
        }catch(Exception e){
            System.out.println("Trimming null value is not allowed");

        }
        System.out.println("End of program");

    }
    //2 types of exceptions
    //checked exception
    //unchecked exception


}
