package com.github.javadojo.binarysearch;

/**
 * An interface to do a search on an array.
 */
public interface Search {

    /**
     * Searches the value {@code toSearch} in the given array {@code values}.
     *
     * @param values the array to search through.
     * @param toSearch the value to search.
     * @return {@code true} if the value {@code toSearch} is found in the array
     *  {@code values}.
     */
    boolean search(int[] values, int toSearch);

}
