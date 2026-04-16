package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void testMatrixMultiplication() {
       
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
        
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
