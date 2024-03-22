public class wrapper {
    public static void main(String[] args) {
        int x= 123;//primitive datatype

        String s1 = String.valueOf(x); //wrapper datatype
        //bcoz of wrapper datatype valueof function is accessible
        //All the datatypes with first letter capital, are known
        //as wrapper datatype thorough which you can use multiple built in functions
        System.out.println(x);
        System.out.println(s1);


        //example 2

        int a=10;
        Integer a2 = Integer.valueOf(a);
        //Collection Framework works with class
        //class hate primitive data type
        //you have to use the wrapper classes in collection
        //we use wrapper classes in collection framework


        //example 3

        Character ch = 'a';
        char a3 = ch;
        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.valueOf(a3));

        System.out.println(Integer.max(55,78));
        System.out.println(Integer.min(55,78));

    }
}
