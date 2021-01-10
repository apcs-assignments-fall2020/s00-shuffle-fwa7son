import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTests {

    @Test
    public void testPerfectShuffle() {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        assertEquals(Arrays.toString(new int[] {1, 21, 2, 22, 3, 23, 4, 24, 5, 25}), Arrays.toString(MyMain.perfectShuffle(arr)), "The perfect shuffle of [1, 2, 3, 4, 5, 21, 22, 23, 24, 25] should be: [1, 21, 2, 22, 3, 23, 4, 24, 5, 25]");

        int[] arr2 = {1, 21, 2, 22, 3, 23, 4, 24, 5, 25};
        assertEquals(Arrays.toString(new int[] {1, 23, 21, 4, 2, 24, 22, 5, 3, 25}), Arrays.toString(MyMain.perfectShuffle(arr2)), "The perfect shuffle of [1, 21, 2, 22, 3, 23, 4, 24, 5, 25] should be: [1, 23, 21, 4, 2, 24, 22, 5, 3, 25]");
    }

    @Test
    public void testSelectionShuffle() {
        int[] arr = {1, 2, 3, 4, 5, 21, 22, 23, 24, 25};
        String str = Arrays.toString(arr);

        // Test that shuffled array is not null
        int[] arr2 = (MyMain.selectionShuffle(arr));
        assertNotNull(arr2, "The shuffled array cannot be equal to null");

        // Test that shuffled array is not exact match to original array
        assertNotEquals(str, Arrays.toString(arr2), "Selection shuffle should not return an array that matches the original array");

        // Test that shuffled array contains the same values as the original (sorted) array
        Arrays.sort(arr2);
        assertEquals(str, Arrays.toString(arr2), "Your shuffled array contains different integers from the original array");
    }
}