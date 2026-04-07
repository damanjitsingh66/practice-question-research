package questions.binarysearch.answer;

public class RootOfaNumber {
    public static void main(String[] args) {

        int n = 3;
        int m = 81;
        //output
        int res = 1;
        int count = 0;
        while (res < m) {
            res *= n;
            count++;
        }
        if(res == m){
            System.out.println(count);
        }
        else{
            System.out.println(-1);
        }
    }
    //brute force
    //tc - O(logₙ m)
    //sc - O(1)
}
