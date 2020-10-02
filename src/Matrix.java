import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    private int widthOfMatrix;
    private int heightOfMatrix;
    private int[][] M;


    protected void InitializeMatrix(Scanner sc){
        int[] WH = StrMIntoIntM(sc.next().split(","),2);
        widthOfMatrix = WH[0];
        heightOfMatrix = WH[1];
        M = new int[widthOfMatrix][heightOfMatrix];
        for (int i = 0 ;i<heightOfMatrix; i++){
            String[] str1 = sc.next().split(",");
            M[i] = (StrMIntoIntM(str1,widthOfMatrix));

        }
    }

    private int[] StrMIntoIntM(String[] str, int width){
        int[] INT= new int[width];
        for (int i = 0; i < INT.length; i++) {
            INT[i] = Integer.parseInt(str[i]);
        }
        return INT;
    }

    protected void PrintMatrix(){
        for (int i = 0; i < heightOfMatrix; i++) {
            System.out.println(Arrays.toString(M[i]));
        }
    }


}
