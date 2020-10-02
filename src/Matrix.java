import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private int widthOfMatrix;
    private int heightOfMatrix;
    private int[][] M;

    public int[][] getM() {
        return M;
    }

    public int getHeightOfMatrix() {
        return heightOfMatrix;
    }

    public void setWidthOfMatrix(int widthOfMatrix) {
        this.widthOfMatrix = widthOfMatrix;
    }

    public void setHeightOfMatrix(int heightOfMatrix) {
        this.heightOfMatrix = heightOfMatrix;
    }

    public void setM(int[][] m) {
        M = m;
    }

    public int getWidthOfMatrix() {
        return widthOfMatrix;
    }

    protected void InitializeMatrix(Scanner sc){
        int[] WH = StrMIntoIntM(sc.next().split(","),2);
        widthOfMatrix = WH[0];
        heightOfMatrix = WH[1];
        M = new int[heightOfMatrix][widthOfMatrix];
        for (int i = 0 ;i<heightOfMatrix; i++){
            String[] str1 = sc.next().split(",");
            M[i] = (StrMIntoIntM(str1,widthOfMatrix));

        }

    }

    protected int[][] GetMatrix(){
        return M;
    }

    private int[] StrMIntoIntM(String[] str, int width){
        int[] INT= new int[width];
        for (int i = 0; i < INT.length; i++) {
            INT[i] = Integer.parseInt(str[i]);
        }
        return INT;
    }



    protected int[][] MultipleWithNumber(int number){
        int[][] MWN = new int[heightOfMatrix][widthOfMatrix];
        for (int i = 0; i < heightOfMatrix; i++) {
            for (int j = 0; j < widthOfMatrix; j++) {
                MWN[i][j] = M[i][j] * number;
            }
        }
        return MWN;
    }

    protected Matrix SumOfMatrix(Matrix m1){
        int[][] SOM = new int[heightOfMatrix][widthOfMatrix];
        if(m1.getHeightOfMatrix()==this.getHeightOfMatrix() && m1.getWidthOfMatrix()==this.getWidthOfMatrix()){
            for (int i = 0; i < heightOfMatrix; i++) {
                for (int j = 0; j < widthOfMatrix; j++) {
                    SOM[i][j] = M[i][j] + m1.GetMatrix()[i][j];
                }
            }
        }
        Matrix som = new Matrix();
        som.setM(SOM);
        som.setHeightOfMatrix(heightOfMatrix);
        som.setWidthOfMatrix(widthOfMatrix);
        return som;
    }




}
