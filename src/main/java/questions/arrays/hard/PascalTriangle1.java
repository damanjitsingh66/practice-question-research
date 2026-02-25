package questions.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

    public static void main(String[] args) {

        int rows = 5;
        List<List<Integer>> resultantList = new ArrayList<>();
        for(int i =1; i<=rows;i++){
            List<Integer> subList = new ArrayList<>();
          for(int j=1; j<=i;j++){
              subList.add(j);
          }
          resultantList.add(subList);
        }
System.out.println(resultantList);
    }

}
