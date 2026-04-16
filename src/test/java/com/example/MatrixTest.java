package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void testMatrixMultiplication() {
        // Define two simple 2x2 matrices
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        // Expected result calculation:
        // Row 1: [(1*5 + 2*7), (1*6 + 2*8)] = [19, 22]
        // Row 2: [(3*5 + 4*7), (3*6 + 4*8)] = [43, 50]
        int[][] expected = {
            {19, 22},
            {43, 50}
        };

        // Call your logic (assumes MatrixMultiplication class has a static multiply method)
        int[][] result = MatrixMultiplication.multiply(A, B);
        
        // assertArrayEquals handles deep comparison of 2D arrays
        assertArrayEquals("The matrix multiplication result is incorrect", expected, result);
    }
}
