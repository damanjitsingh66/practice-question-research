package questions.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

    public static void main(String[] args) {

        int rows = 10;
        int row = 2;
        int col =2;
        List<List<Integer>> resultantList = new ArrayList<>();
        for(int i =1; i<=rows;i++){
            List<Integer> subList = new ArrayList<>();
          for(int j=1; j<=i;j++){

              if(j==1 || j==i){
                  subList.add(1);
              }
              else{
                  if(resultantList.isEmpty()){
                      subList.add(j);
                  }else{
                      List<Integer> previousSublist  = resultantList.get(i-2);
                      if(!previousSublist.isEmpty()){

                          subList.add(previousSublist.get(j-2)+previousSublist.get(j-1));
                      }
                  }

              }

          }
          resultantList.add(subList);
        }
System.out.println(resultantList);

        if(resultantList.size()==1){
            System.out.println("number is - "+resultantList.get(row-1).get(col-1));
        }else{
            System.out.println("number is - "+resultantList.get(row-1).get(col-1));
        }


    }
    //my first hard solution self without help
    //Time Complexity	O(n²)
    //Space Complexity	O(n²)

}
