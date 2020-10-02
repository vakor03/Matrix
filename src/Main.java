import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m1 = new Matrix();
        m1.InitializeMatrix(sc);


        Matrix m2 = new Matrix();
        m2.InitializeMatrix(sc);


        Matrix mom = m1.MultipleOfMatrixes(m2);
        PrintMatrix(mom);
    }
    public static void PrintMatrix(Matrix RandomM){
        for (int i = 0; i < RandomM.getHeightOfMatrix(); i++) {
            System.out.println(Arrays.toString(RandomM.getM()[i]));
        }
    }
}
