package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The scenarios for merging k sorted arrays. A concrete subclass supplies
 * mergeAll() to pick the solution under test.
 */
public abstract class MergeKSortedArraysTest {

  // Calls the solution under test.
  protected abstract int[] mergeAll(int[][] arrays);

  @Test
  public void noArraysGiveAnEmptyResult() {
    assertContents(new int[] {}, mergeAll(new int[][] {}));
  }

  @Test
  public void oneArrayComesBackAsIs() {
    assertContents(new int[] {1, 2, 3}, mergeAll(new int[][] {{1, 2, 3}}));
  }

  @Test
  public void oneEmptyArrayGivesAnEmptyResult() {
    assertContents(new int[] {}, mergeAll(new int[][] {{}}));
  }

  @Test
  public void twoArraysInterleave() {
    assertContents(new int[] {1, 2, 3, 4, 5, 6},
        mergeAll(new int[][] {{1, 3, 5}, {2, 4, 6}}));
  }

  @Test
  public void threeArraysOfDifferentLengths() {
    assertContents(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
        mergeAll(new int[][] {{1, 3, 5, 7}, {2, 4, 6}, {0, 8, 9, 10, 11}}));
  }

  @Test
  public void fourArraysInterleave() {
    assertContents(new int[] {1, 2, 3, 4, 5, 7, 8, 9},
        mergeAll(new int[][] {{1, 8}, {3, 5}, {2, 9}, {4, 7}}));
  }

  @Test
  public void severalEmptyArraysGiveAnEmptyResult() {
    assertContents(new int[] {}, mergeAll(new int[][] {{}, {}, {}}));
  }

  @Test
  public void emptyArraysAmongOthersAreSkipped() {
    assertContents(new int[] {1, 2, 3},
        mergeAll(new int[][] {{}, {2}, {}, {1, 3}, {}}));
  }

  @Test
  public void singleElementArraysGetSorted() {
    assertContents(new int[] {1, 2, 3, 4, 5},
        mergeAll(new int[][] {{5}, {1}, {4}, {2}, {3}}));
  }

  @Test
  public void duplicatesWithinAndAcrossArraysAreAllKept() {
    assertContents(new int[] {1, 1, 1, 2, 2, 2, 3, 3, 3},
        mergeAll(new int[][] {{1, 1, 3}, {1, 2, 2}, {2, 3, 3}}));
  }

  @Test
  public void negativesSortBeforePositives() {
    assertContents(new int[] {-7, -3, 1, 4, 6},
        mergeAll(new int[][] {{-3, 4}, {-7, 1, 6}}));
  }

  @Test
  public void inputsAreNotModified() {
    int[][] arrays = {{1, 8}, {3, 5}, {2, 9}, {4, 7}};
    mergeAll(arrays);
    assertContents(new int[] {1, 8}, arrays[0]);
    assertContents(new int[] {3, 5}, arrays[1]);
    assertContents(new int[] {2, 9}, arrays[2]);
    assertContents(new int[] {4, 7}, arrays[3]);
  }

  // Checks that actual holds the same values as expected, in the same order.
  private static void assertContents(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
