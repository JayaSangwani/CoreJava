public class exceptionsexplanation {
    public static void main(String[] args) {
        String sh = args[0]; //1 argument //5,15 --> String 5
        int x = Integer.parseInt(sh); //String to integer
        int z = 10/x; //if you divide it by 0 it will give arithimetic exception

        //1. if you dont pass any argument --> Arrayinsdexoutofbound
        //2. if you pass "jaya" this cant convert to integer --> numberformateexception
        //3. 10/0 --> ArthimeticExcepions
        //JVM is giving all the above exceptions

        System.out.println(x);
        System.out.println(z);
    }
}
