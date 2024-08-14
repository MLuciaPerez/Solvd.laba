package SortingAlgorithm;


public class Main {
    public static void main(String[] args) {

        System.out.println(  "\nSelection:");

        int[] array = {70, 48, 14, 36, 18, 8, 2};  // Example array, declared and initialized

        selection(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + "  ");  // Prints the now sorted array
        }

        System.out.println( "\nBubble:" );

        int[] array2 = {70, 48, 14, 36, 18, 8, 2};  // Example array, declared and initialized

        bubble(array2);

        for (int i = 0; i < array2.length; i++) {
            System.out.print( array2[i] + "  ");  // Prints the now sorted array
        }


    }

    public static void selection(int[] array) {

        // Iterate over each element of the array except the last one
        for (int i = 0; i < array.length - 1; i++) {
            int minimumIndex = i;  // Assuming that the first element is the minimum

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;  // Updates the index of the minimum element
                }
            }

            // Swaps the found minimum element with the first element of the unsorted part
            int temporary = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temporary;
        }
    }


    public static void bubble(int[] array) {
        int m = array.length;

        // Iterates over each element of the array
        for (int i = 0; i < m - 1; i++) {
            // Initializes a flag that will help identify if a swap was made in this iteration
            boolean swapped = false;

            // Iterates over the unsorted elements of the array
            for (int j = 0; j < m - i - 1; j++) { //The inner loop is responsible for comparing/ swapping the current element with the next element
                if (array[j] > array[j + 1]) {
                    // If the current element is greater than the next element, it swaps them
                    int swapValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swapValue;

                    // Sets the flag to true indicating that a swap was made
                    swapped = true;
                }
            }

            // If no swaps were made, the array is already sorted. We can break out of the loop
            if (!swapped) {
                break;
            }
        }
    }
}
