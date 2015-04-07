package com.github.javadojo.binarysearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTest {

    private final BinarySearch objectToTest = new BinarySearch();

    private final int[] testArray = new int[] {
        1, 3, 5, 7, 8, 9, 10, 12, 14, 17,
    };

    @Test(enabled = false)
    public void testFound() {
        Assert.assertTrue(objectToTest.search(testArray, 1),
            "Expected the value 1 to be found.");
    }

    @Test(enabled = false)
    public void testNotFound() {
        Assert.assertFalse(objectToTest.search(testArray, 2),
            "Expected the value 2 not to be found.");
    }

}
