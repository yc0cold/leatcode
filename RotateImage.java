import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int x = 0,y = 0;
        int pre=0, tmp=0;

        int depth = matrix.length%2 == 0 ? matrix.length/2 : matrix.length/2 + 1;

        System.out.println("depth = " + depth);

        int len = matrix.length;
        for (int i = 0; i < depth; i++) {

            y = i;
            x = i;
            System.out.println(" ******** ");
            System.out.println("len");
            //System.out.println("len = " + len);
            for (int j = 0; j < len-1; j++) {
                pre = matrix[y][x];
                System.out.println(" ===================== ");
                for (int k = 0; k < 4; k++) {  // clock-wise, 4 times

                    int savedY = y;
                    y = x;
                    x = matrix.length-1-savedY;

                    //System.out.println("y = " + y);
                    //System.out.println("x = " + x);
                    tmp = matrix[y][x]; // save number to be changed
                    matrix[y][x] = pre; // change number

                    System.out.println("pre = " + pre);
                    System.out.println("y = " + y);
                    System.out.println("x = " + x);
                    System.out.println(Arrays.deepToString(matrix));
                    System.out.println("tmp = " + tmp);
                    pre = tmp;          // change pre into the original number
                }
                x++;
            }
            len = len-2;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        RotateImage ri = new RotateImage();
        ri.rotate(matrix);
    }
}
