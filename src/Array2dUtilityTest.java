import static org.junit.jupiter.api.Assertions.*;

public class Array2dUtilityTest {

    private int[][] array2d;
    private int[][] array2d2;

    private int[][] array2d3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        array2d =
                new int[][]{
                        {1, -2, 3, 4, 5},
                        {6, 7, -8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, -22, 23, 24, 25}
                };

        array2d2 =
                new int[][]{
                        {11, -2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, -13, 14, 15},
                        {16, 17, 108, -29, 20},
                        {21, 22, 203, 24, 45}
                };

        array2d3 =
                new int[][] {
                        {14, 2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, 13, 14, 15},
                        {16, 127, 108, 39, 20},
                        {21, 222, 20, 29, 45}
                };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
        array2d3 = null;
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertTrue(Array2dUtility.sum(array2d) == 261);
        assertTrue(Array2dUtility.sum(array2d2) == 772);
        assertTrue(Array2dUtility.sum(array2d3) == 1005);
    }

    @org.junit.jupiter.api.Test
    void average() {
        assertTrue(Array2dUtility.average(array2d) == 10.44);
        assertTrue(Array2dUtility.average(array2d2) == 30.88);
        assertTrue(Array2dUtility.average(array2d3) == 40.2);
    }

    @org.junit.jupiter.api.Test
    void minimum() {
        assertTrue(Array2dUtility.minimum(array2d) == -22);
        assertTrue(Array2dUtility.minimum(array2d2) == -29);
        assertTrue(Array2dUtility.minimum(array2d3) == 2);
    }

    @org.junit.jupiter.api.Test
    void maximum() {
        assertTrue(Array2dUtility.maximum(array2d) == 25);
        assertTrue(Array2dUtility.maximum(array2d2) == 203);
        assertTrue(Array2dUtility.maximum(array2d3) == 222);
    }

    @org.junit.jupiter.api.Test
    void evenCountStandard() {
        assertTrue(Array2dUtility.evenCountStandard(array2d) == 12);
        assertTrue(Array2dUtility.evenCountStandard(array2d2) == 11);
        assertTrue(Array2dUtility.evenCountStandard(array2d3) == 12);
    }

    @org.junit.jupiter.api.Test
    void evenCountEnhanced() {
        assertTrue(Array2dUtility.evenCountEnhanced(array2d) == 12);
        assertTrue(Array2dUtility.evenCountEnhanced(array2d2) == 11);
        assertTrue(Array2dUtility.evenCountEnhanced(array2d3) == 12);
    }

    @org.junit.jupiter.api.Test
    void allPositive() {
        assertTrue(Array2dUtility.allPositive(array2d) == false);
        assertTrue(Array2dUtility.allPositive(array2d2) == false);
        assertTrue(Array2dUtility.allPositive(array2d3) == true);
    }

    @org.junit.jupiter.api.Test
    void rowSums() {
        int[] rowSums1 = Array2dUtility.rowSums(array2d);
        int[] rowSums2 = Array2dUtility.rowSums(array2d2);
        int[] rowSums3 = Array2dUtility.rowSums(array2d3);

        assertTrue(rowSums1[0] == 11);
        assertTrue(rowSums1[1] == 24);
        assertTrue(rowSums1[2] == 65);
        assertTrue(rowSums1[3] == 90);
        assertTrue(rowSums1[4] == 71);

        assertTrue(rowSums2[0] == 31);
        assertTrue(rowSums2[1] == 144);
        assertTrue(rowSums2[2] == 150);
        assertTrue(rowSums2[3] == 132);
        assertTrue(rowSums2[4] == 315);

        assertTrue(rowSums3[0] == 38);
        assertTrue(rowSums3[1] == 144);
        assertTrue(rowSums3[2] == 176);
        assertTrue(rowSums3[3] == 310);
        assertTrue(rowSums3[4] == 337);
    }

    @org.junit.jupiter.api.Test
    void colSums() {
        int[] colSums1 = Array2dUtility.colSums(array2d);
        int[] colSums2 = Array2dUtility.colSums(array2d2);
        int[] colSums3 = Array2dUtility.colSums(array2d3);

        assertTrue(colSums1[0] == 55);
        assertTrue(colSums1[1] == 12);
        assertTrue(colSums1[2] == 49);
        assertTrue(colSums1[3] == 70);
        assertTrue(colSums1[4] == 75);

        assertTrue(colSums2[0] == 65);
        assertTrue(colSums2[1] == 231);
        assertTrue(colSums2[2] == 329);
        assertTrue(colSums2[3] == 32);
        assertTrue(colSums2[4] == 115);

        assertTrue(colSums3[0] == 68);
        assertTrue(colSums3[1] == 545);
        assertTrue(colSums3[2] == 172);
        assertTrue(colSums3[3] == 105);
        assertTrue(colSums3[4] == 115);
    }

}