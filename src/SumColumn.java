import java.util.Scanner;

public class SumColumn {
    public static void sumCol(int[][] array,int row,int col)
    {
        for(int i=0;i<col;i++)
        {
            int sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=array[j][i];
            }
            System.out.println(sum+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        sumCol(array,row,col);
    }
}
