package practice;

/** Solution to the union of two sorted arrays problem. */
public final class SortedUnion {

  private SortedUnion() {
    // This class should not be instantiated!
  }

  // Returns a new sorted array holding every value that appears in either
  // input, each value once. Assumes arr1 and arr2 are not null, are sorted,
  // and have no duplicate values of their own.
  public static int[] union(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
    while (i < arr1.length || j < arr2.length) {
      if (i >= arr1.length) {
        result[k++] = arr2[j++];
      } else if (j >= arr2.length) {
        result[k++] = arr1[i++];
      } else if (arr1[i] < arr2[j]) {
        result[k++] = arr1[i++];
      } else if (arr1[i] > arr2[j]) {
        result[k++] = arr2[j++];
      } else {
        result[k++] = arr1[i++];  // a tie: copy the value once
        j++;                      // and skip its twin in arr2
      }
    }
    int[] trimmed = new int[k];
    for (int t = 0; t < k; t++) {
      trimmed[t] = result[t];
    }
    return trimmed;
  }
}
