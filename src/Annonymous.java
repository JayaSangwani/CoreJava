public class Annonymous {
    public static void main(String[] args) {
        //student s1 = new student(); not allowed


        //Annonymous class
        student s1 = new student() {
            @Override
            public void setId() {
                System.out.println("calling annonymous class");
            }

        };
        s1.setId();
    }

}

class B{ //concrete class
 int a =10;
}

interface student{
    int id = 11;
    void setId();
}
