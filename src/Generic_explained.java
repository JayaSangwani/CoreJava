public class Generic_explained {
    public static void main(String[] args) {
        temp("Jaya");
        temp(123);
        temp(true);
        temp(3.14);

        max(23, 34);
    }



    public static <Generic> void temp(Generic x) {
        System.out.println(x);
    }
    public static <T> void max(T a, T b){
        System.out.println(a);
        System.out.println(b);

        }

    }

