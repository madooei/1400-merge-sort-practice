package demo;

import java.util.Arrays;
import practice.MergeKSortedArraysPairwise;

/** A demo of MergeKSortedArraysPairwise on the notes' example. */
public final class MergeKSortedArraysPairwiseDemo {

  private MergeKSortedArraysPairwiseDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[][] arrays = {{1, 8}, {3, 5}, {2, 9}, {4, 7}};
    for (int i = 0; i < arrays.length; i++) {
      System.out.println("arrays[" + i + "]: " + Arrays.toString(arrays[i]));
    }

    // Expect [1, 2, 3, 4, 5, 7, 8, 9].
    int[] merged = MergeKSortedArraysPairwise.mergeAll(arrays);
    System.out.println("merged: " + Arrays.toString(merged));
  }
}
