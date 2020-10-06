import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m1 = new Matrix();
        m1.InitializeMatrix(sc);


       // Matrix m2 = new Matrix();
        //m2.InitializeMatrix(sc);
        System.out.println("Hallo world");

        Matrix mom = m1.TransponateMatrix();
        PrintMatrix(mom);
    }
    private static void PrintMatrix(Matrix RandomM){
        for (int i = 0; i < RandomM.getHeightOfMatrix(); i++) {
            System.out.println(Arrays.toString(RandomM.getM()[i]));
        }
    }
}
