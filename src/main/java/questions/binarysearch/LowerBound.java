package questions.binarysearch;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr ={1,3,4,6,6,7,8};

        int k = 5;

        int closestValue = arr[0];
        int closestIndex = 0;
        int minimumValue = Math.abs(k-closestValue);
        for(int i=1; i<arr.length; i++){

            int currentDifference = Math.abs(k - arr[i]);

            if(currentDifference<minimumValue){
                minimumValue = currentDifference;
                closestValue = arr[i];
                closestIndex = i;
            }



        }




System.out.println("closest_value - "+closestValue + "at_index" + closestIndex);
    }

}
