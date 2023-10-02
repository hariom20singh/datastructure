public class QuickSort {

    public static int[] quickSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int pivot = array[0];
        int[] less = new int[array.length - 1];
        int[] greater = new int[array.length - 1];

        int lessIndex = 0;
        int greaterIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                less[lessIndex++] = array[i];
            } else {
                greater[greaterIndex++] = array[i];
            }
        }

        int[] sortedArray = new int[array.length];
        System.arraycopy(quickSort(less), 0, sortedArray, 0, lessIndex);
        sortedArray[lessIndex] = pivot;
        System.arraycopy(quickSort(greater), 0, sortedArray, lessIndex + 1, greaterIndex);

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};

        int[] sortedArray = quickSort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
