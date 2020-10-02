import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix m1 = new Matrix();
        m1.InitializeMatrix(sc);
       // int[][] K = m1.MultipleWithNumber(2);
       // int[][] H = m1.GetMatrix();
       // m1.PrintMatrix(K);
       // m1.PrintMatrix(H);

        Matrix m2 = new Matrix();
        m2.InitializeMatrix(sc);
        //int[][] H2 = m2.GetMatrix();
        //m2.PrintMatrix(H2);
        Matrix Sum = m1.SumOfMatrix(m2);
        PrintMatrix(Sum);
        System.out.println();
    }
    public static void PrintMatrix(Matrix RandomM){
        for (int i = 0; i < RandomM.getHeightOfMatrix(); i++) {
            System.out.println(Arrays.toString(RandomM.getM()[i]));
        }
    }
}
