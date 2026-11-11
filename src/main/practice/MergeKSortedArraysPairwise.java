package practice;

import sorts.MergeTwoSortedArrays;

/** Practice problem: merge k sorted arrays in pairs, recursively. */
public final class MergeKSortedArraysPairwise {

  private MergeKSortedArraysPairwise() {
    // This class should not be instantiated!
  }

  // Merges the arrays in pairs, recursively. Assumes each array is sorted.
  // Returns a sorted array holding every element of every input; with a single
  // input array, returns that array itself.
  public static int[] mergeAll(int[][] arrays) {
    if (arrays.length == 0) {
      return new int[0];
    }
    return mergeAll(arrays, 0, arrays.length);
  }

  // Merges arrays[start..end-1] into one sorted array. Pre: end > start.
  private static int[] mergeAll(int[][] arrays, int start, int end) {
    if (end - start == 1) {
      return arrays[start];
    }
    int mid = start + (end - start) / 2;
    int[] left = mergeAll(arrays, start, mid);       // merge the left half
    int[] right = mergeAll(arrays, mid, end);        // merge the right half
    return MergeTwoSortedArrays.merge(left, right);  // merge the two results
  }
}
