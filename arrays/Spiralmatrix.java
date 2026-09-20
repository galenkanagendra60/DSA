import java.util.*;

class Spiralmatrix{
    public static  List<Integer> spiralOrder(int[][] matrix) {       

        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bootom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top<=bootom && left<=right)
        {
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            top++;

            for(int i=top;i<=bootom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bootom)
            {
                for(int j=right;j>=left;j--)
                {
                    result.add(matrix[bootom][j]);
                }
            bootom--;
            }

            if(left<=right)
            {
                for(int i=bootom;i>=top;i--)
                {
                    result.add(matrix[i][left]);

                }

                left++;
            }


        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array elements :");
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt(); 
            }
        }

        List<Integer> result =spiralOrder(matrix); 
        System.out.println("Result "+result);

    }
}