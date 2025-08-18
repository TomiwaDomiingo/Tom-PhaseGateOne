import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FireDrill3Test<FireDrill3> {

    @Test
    public void testGetEvenIndexesWithOddLengthArray() {
        FIreDrill3 drill = new FIreDrill3();
        int[] input = {10, 20, 30, 40, 50};
        int[] expected = {10, 30, 50};
        int[] result = ((FIreDrill3) drill).TaskFour(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetOddIndexesWithEvenLengthArray() {
        FIreDrill3 drill = new FIreDrill3();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        int[] result = drill.TaskFive(input);
        assertArrayEquals(expected, result);
    }
}