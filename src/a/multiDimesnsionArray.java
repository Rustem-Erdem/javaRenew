package a;

public class multiDimesnsionArray {
    public static void main(String[] args) {
        int[][]arr={{10,21,32,},{54,65,76}};

        int[][] arr2 = new int[2][3];
        arr2[0][0]=10;
        arr2[0][1]=21;
        arr2[0][2]=32;
        arr2[1][0]=43;
        arr2[1][1]=54;
        arr2[1][2]=65;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("data is :"+ arr2[i][j]);

            }

        }
    }
}
