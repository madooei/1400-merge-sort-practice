package practice;

import sorts.MergeTwoSortedArrays;

/** Solutions to the merge k sorted arrays problem. */
public final class MergeKSortedArrays {

  private MergeKSortedArrays() {
    // This class should not be instantiated!
  }

  // Merges the arrays one at a time into a running result. Assumes each array
  // is sorted. Returns a new sorted array holding every element of every input.
  public static int[] mergeAllOneAtATime(int[][] arrays) {
    int[] result = new int[0];
    for (int i = 0; i < arrays.length; i++) {
      result = MergeTwoSortedArrays.merge(result, arrays[i]);
    }
    return result;
  }

  // Merges the arrays in pairs, recursively. Assumes each array is sorted.
  // Returns a sorted array holding every element of every input; with a single
  // input array, returns that array itself.
  public static int[] mergeAllPairwise(int[][] arrays) {
    if (arrays.length == 0) {
      return new int[0];
    }
    return mergeAllPairwise(arrays, 0, arrays.length);
  }

  // Merges arrays[start..end-1] into one sorted array. Pre: end > start.
  private static int[] mergeAllPairwise(int[][] arrays, int start, int end) {
    if (end - start == 1) {
      return arrays[start];
    }
    int mid = start + (end - start) / 2;
    int[] left = mergeAllPairwise(arrays, start, mid);  // merge the left half
    int[] right = mergeAllPairwise(arrays, mid, end);   // merge the right half
    return MergeTwoSortedArrays.merge(left, right);     // merge the two results
  }
}
