package practice;

/** Runs the merge-k scenarios against the pairwise solution. */
public class MergeKSortedArraysPairwiseTest extends MergeKSortedArraysTest {

  @Override
  protected int[] mergeAll(int[][] arrays) {
    return MergeKSortedArrays.mergeAllPairwise(arrays);
  }
}
