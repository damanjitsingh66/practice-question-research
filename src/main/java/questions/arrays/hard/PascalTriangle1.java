package questions.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

    public static void main(String[] args) {

        int rows = 5;
        int row = 5;
        int col =2;

        long result = nCr(row-1,col-1) ;

System.out.println(result);



//        List<List<Integer>> resultantList = new ArrayList<>();
//        for(int i =1; i<=rows;i++){
//            List<Integer> subList = new ArrayList<>();
//          for(int j=1; j<=i;j++){
//
//              if(j==1 || j==i){
//                  subList.add(1);
//              }
//              else{
//                  if(resultantList.isEmpty()){
//                      subList.add(j);
//                  }else{
//                      List<Integer> previousSublist  = resultantList.get(i-2);
//                      if(!previousSublist.isEmpty()){
//
//                          subList.add(previousSublist.get(j-2)+previousSublist.get(j-1));
//                      }
//                  }
//
//              }
//
//          }
//          resultantList.add(subList);
//        }
//System.out.println(resultantList);
//
//        if(resultantList.size()==1){
//            System.out.println("number is - "+resultantList.get(row-1).get(col-1));
//        }else{
//            System.out.println("number is - "+resultantList.get(row-1).get(col-1));
//        }
        //my first hard solution self without help
        //Time Complexity	O(n²)
        //Space Complexity	O(n²)




    }


    public static long nCr(int n, int k) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
//tc- O(min(c,r−c))
    // sc - O(1)



}
