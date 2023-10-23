import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with values (1, 2, 3, 4, 5, 6, 7)
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array using Fisher-Yates (Knuth) algorithm
        shuffleArray(array);

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            // Generate an index j such that 0 <= j <= i
            int j = i + random.nextInt(n - i);

            // Swap array[i] with the element at random index j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
