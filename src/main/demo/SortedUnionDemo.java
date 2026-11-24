package demo;

import java.util.Arrays;
import practice.SortedUnion;

/** A demo of SortedUnion on the example the notes trace. */
public final class SortedUnionDemo {

  private SortedUnionDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7};
    int[] arr2 = {2, 3, 6, 7, 9};
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));

    // 3 and 7 are in both arrays and appear once. Expect [1, 2, 3, 5, 6, 7, 9].
    int[] union = SortedUnion.union(arr1, arr2);
    System.out.println("union: " + Arrays.toString(union));
  }
}
