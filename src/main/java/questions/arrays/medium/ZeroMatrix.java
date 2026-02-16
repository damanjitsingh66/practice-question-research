package questions.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    public static void main(String[] args) {

        int[][] matrix={
                {1,2,0},
                {4,9,5},
                {5,7,8}
        };
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        //mine solution
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns

                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }

            }
        }
         System.out.println("rows"+ row + "cols" + col);


        for(int i=0; i<matrix.length;i++){

            for(int j:col){

                matrix[i][j] = 0;
            }

        }

        for(int i:row){

            for(int j=0; j<matrix[i].length;j++){

                matrix[i][j] = 0;
            }

        }


        for (int[] ints : matrix) {          // rows
            for (int anInt : ints) {   // columns
                System.out.print(anInt + " ");
            }
            System.out.println();
        }



    }
}
