package questions.IQuestions;

public class NumberOfOperationsForString {

    public static void main(String[] args) {

        String s = "011100";
        System.out.println("operations would be " + solution(s));


    }

        public static int solution(String S) {
            int operations = 0;
            int n = S.length();
            int i = 0;
            while(i < n && S.charAt(i) == '0') {
                i++;
            }
            if(i == n) return 0;
            for(int j=i+1; j< n ; j++) {
                if(S.charAt(j) == '0') {
                    operations += 1;
                } else {
                    operations += 2;
                }
            }
            return operations + 1; // for first '1'
        }



}
