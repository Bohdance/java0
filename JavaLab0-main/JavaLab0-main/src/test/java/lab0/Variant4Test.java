package lab0;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class Variant4Test {

    //    Integer
    @Test
    public void testValidInput() {
        int result1 = Variant4.task1(12, 5);
        System.out.println("testValidInput: task1(12, 5) = " + result1);
        assertEquals(result1, 2);

        int result2 = Variant4.task1(45, 14);
        System.out.println("testValidInput: task1(45, 14) = " + result2);
        assertEquals(result2, 3);

        int result3 = Variant4.task1(99, 100);
        System.out.println("testValidInput: task1(99, 100) = " + result3);
        assertEquals(result3, 0);

        int result4 = Variant4.task1(10, 12);
        System.out.println("testValidInput: task1(10, 12) = " + result4);
        assertEquals(result4, 0);
    }

    @Test
    public void testInvalidInput() {
        int result1 = Variant4.task1(5, 0);
        System.out.println("testInvalidInput: task1(5, 0) = " + result1);
        assertEquals(result1, 0);

        int result2 = Variant4.task1(123, -5);
        System.out.println("testInvalidInput: task1(123, -5) = " + result2);
        assertEquals(result2, 0);

        int result3 = Variant4.task1(-12, 6);
        System.out.println("testInvalidInput: task1(-12, 6) = " + result3);
        assertEquals(result3, 0);

        int result4 = Variant4.task1(5, 10);
        System.out.println("testInvalidInput: task1(5, 10) = " + result4);
        assertEquals(result4, 0);
    }


    //    Boolean
    @Test
    public void testBothConditionsTrue() {
        Variant4 checker = new Variant4();
        assertTrue(checker.task2(3, 2), "A > 2 and B < 3 should be true");
    }

    @Test
    public void testConditionAFail() {
        Variant4 checker = new Variant4();
        assertFalse(checker.task2(2, 2), "A should be greater than 2");
    }

    @Test
    public void testConditionBFail() {
        Variant4 checker = new Variant4();
        assertFalse(checker.task2(3, 3), "B should be less than 3");
    }

    @Test
    public void testBothConditionsFalse() {
        Variant4 checker = new Variant4();
        assertFalse(checker.task2(1, 4), "Both conditions should be false");
    }


    //    If
    @Test
    public void testAllPositive() {
        Variant4 checker = new Variant4();
        assertEquals(checker.task3(1, 2, 3), 3, "All numbers are positive");
    }

    @Test
    public void testTwoPositiveOneNegative() {
        Variant4 checker = new Variant4();
        assertEquals(checker.task3(-1, 2, 3), 2, "Two numbers are positive");
    }

    @Test
    public void testOnePositiveTwoNegative() {
        Variant4 checker = new Variant4();
        assertEquals(checker.task3(-1, -2, 3), 1, "One number is positive");
    }

    @Test
    public void testAllNegative() {
        Variant4 checker = new Variant4();
        assertEquals(checker.task3(-1, -2, -3), 0, "No numbers are positive");
    }

    //    Case
    @Test
    public void testDaysInMonth() {
        Variant4 checker = new Variant4();
        assertEquals(checker.task4(1), 31, "January should have 31 days");
        assertEquals(checker.task4(2), 28, "February should have 28 days in a non-leap year");
        assertEquals(checker.task4(4), 30, "April should have 30 days");
        assertEquals(checker.task4(6), 30, "June should have 30 days");
        assertEquals(checker.task4(12), 31, "December should have 31 days");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidMonth() {
        Variant4 checker = new Variant4();
        checker.task4(0);  // Неправильний місяць
        checker.task4(13); // Неправильний місяць
    }


    //    For
    @Test
    public void testCalculateCost() {
        Variant4 calculator = new Variant4();

        double price1 = 5.0;
        double[] expected1 = {5.0, 10.0, 50.0};
        assertEquals(calculator.task5(price1), expected1, 0.01);

        double price2 = 3.0;
        double[] expected2 = {3.0, 6.0, 30.0};
        assertEquals(calculator.task5(price2), expected2, 0.01);

        double price3 = 7.5;
        double[] expected3 = {7.5, 15.0, 75.0};
        assertEquals(calculator.task5(price3), expected3, 0.01);
    }


    //    while
    @Test
    public void testIsPowerOfThree() {
        Variant4 checker = new Variant4();

        assertTrue(checker.task6(1), "1 is a power of 3 (3^0)");
        assertTrue(checker.task6(3), "3 is a power of 3 (3^1)");
        assertTrue(checker.task6(9), "9 is a power of 3 (3^2)");
        assertTrue(checker.task6(27), "27 is a power of 3 (3^3)");

        assertFalse(checker.task6(2), "2 is not a power of 3");
        assertFalse(checker.task6(4), "4 is not a power of 3");
        assertFalse(checker.task6(10), "10 is not a power of 3");
        assertFalse(checker.task6(28), "28 is not a power of 3");
    }


    //    Array
    @Test
    public void testGeometricProgression() {
        Variant4 generator = new Variant4();

        int[] expected1 = {1, 2, 4, 8};
        assertEquals(generator.task7(4, 1, 2), expected1);

        int[] expected2 = {3, 9, 27, 81};
        assertEquals(generator.task7(4, 3, 3), expected2);

        int[] expected3 = {5, 25, 125};
        assertEquals(generator.task7(3, 5, 5), expected3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidN() {
        Variant4 generator = new Variant4();
        generator.task7(1, 1, 2);  // N <= 1
    }


    //    Matrix
    @Test
    public void testMatrix() {
        Variant4 generator = new Variant4();
        int[] numbers = {1, 2, 3};

        int[][] expected1 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        assertEquals(generator.task8(3, 3, numbers), expected1);

        int[][] expected2 = {
                {4, 5},
                {4, 5},
                {4, 5}
        };
        assertEquals(generator.task8(3, 2, new int[]{4, 5}), expected2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidMatrixInput() {
        Variant4 generator = new Variant4();
        generator.task8(2, 2, new int[]{1}); // Incorrect length of numbers array
    }
}
