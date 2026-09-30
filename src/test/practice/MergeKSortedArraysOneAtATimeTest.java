package practice;

/** Runs the merge-k scenarios against the one-at-a-time solution. */
public class MergeKSortedArraysOneAtATimeTest extends MergeKSortedArraysTest {

  @Override
  protected int[] mergeAll(int[][] arrays) {
    return MergeKSortedArrays.mergeAllOneAtATime(arrays);
  }
}
