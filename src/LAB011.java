package src;

public class LAB011 {
    public static void main(String[] args) {
        //2D Array
        int a[][] = new int[3][3];
        a[0][0] =12;
        a[0][1] =14;
        a[0][2] =15;

        a[1][0] =16;
        a[1][1] =17;
        a[1][2] =18;

        a[2][0] =19;
        a[2][1] =20;
        a[2][2] =21;

        for (int i=0; i < a.length; i++){
            for (int j =0; j< a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
