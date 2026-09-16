public class SquaredSorted {
    public static boolean withinConstraint(int number) {
        return (-100 < number && number <= 1000);
    }

    public static int[] makeSquared(int[] array) {

        for(int index = 0; index < array.length; index++) {
            array[index] = array[index] * array[index];
        }
        return array;
    }

    public static int[] sortedArray(int[] array) {
        int swap;
        for(int index = 0; index < array.length; index++) {
            for(int index2 = index + 1; index2 < array.length; index2++) {
                if(array[index] > array[index2]) {
                    swap = array[index];
                    array[index] = array[index2];
                    array[index2] = swap;
                }
            }

        }
        return array;
    }

    public static int[] solution(int[] array) {
        if (array == null || array.length == 0){

        }
        for(int index = 0; index < array.length; index++) {
            if(!withinConstraint(array[index])) {
                return null;
            }
        }
        makeSquared(array);
        sortedArray(array);

        return array;
    }


}