package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
      //  int[][]  a=new int[4][3]; //4 rows & 3 columns

        int[][] a={{2,3,4},{5,6,7},{8,9,10},{11,12,13}};

        //nested for loop

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }

    }
}
