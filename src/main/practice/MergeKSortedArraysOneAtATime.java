package practice;

import sorts.MergeTwoSortedArrays;

/** Practice problem: merge k sorted arrays, one array at a time. */
public final class MergeKSortedArraysOneAtATime {

  private MergeKSortedArraysOneAtATime() {
    // This class should not be instantiated!
  }

  // Merges the arrays one at a time into a running result. Assumes each array
  // is sorted. Returns a new sorted array holding every element of every input.
  public static int[] mergeAll(int[][] arrays) {
    int[] result = new int[0];
    for (int i = 0; i < arrays.length; i++) {
      result = MergeTwoSortedArrays.merge(result, arrays[i]);
    }
    return result;
  }
}
