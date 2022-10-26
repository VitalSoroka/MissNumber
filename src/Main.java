public class Main {

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,27};
        System.out.println(searchMissNumber(array));
    }

    static int searchMissNumber(int[] array){
        int low = 0;
        int high = array.length - 1;
        int difBetweenIndexAndFirstElement = array[0];
        while(low <= high){
            int median = (high + low) / 2;
            if(array[median + 1] - array[median] == 1){
                if(array[median] == median + difBetweenIndexAndFirstElement){
                    low = median + 1;
                } else if (array[median] > median + difBetweenIndexAndFirstElement) {
                    high = median -1;
                }
            } else{
                return median + difBetweenIndexAndFirstElement + 1;
            }

        }
        return -1;
    }
}
