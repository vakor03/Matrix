import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    private int widthOfMatrix;
    private int heightOfMatrix;
    private List<int[]> Matrix = new ArrayList<>();



    protected void InitializeMatrix(Scanner sc){
        heightOfMatrix = sc.nextInt();
        for (int i = 0 ;i<heightOfMatrix; i++){
            String[] str1 = sc.next().split(",");
            widthOfMatrix = str1.length;
            Matrix.add(StrMIntoIntM(str1));

        }
    }

    private int[] StrMIntoIntM(String[] str){
        int[] INT= new int[widthOfMatrix];
        for (int i = 0; i < INT.length; i++) {
            INT[i] = Integer.parseInt(str[i]);
        }
        return INT;
    }

    protected void PrintMatrix(){
        for (int[] row : Matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


}
