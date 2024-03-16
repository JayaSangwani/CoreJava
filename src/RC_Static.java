public class RC_Static {
    public static void main(String[] args) {
        System.out.println(StaticVariable_Function.college_name);
        StaticVariable_Function.college_name = "KT";
        //college name got updated
        StaticVariable_Function.printname();

        //System.out.println(StaticVariable_Function.version);
        //not allowed as it is an instance variable
        //for instance variable we need to create a object

        StaticVariable_Function st = new StaticVariable_Function();
        st.printversion();

        st.version=99;//version got updated
        st.printversion();


    }
}
