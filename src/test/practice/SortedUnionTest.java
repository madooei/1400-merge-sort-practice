package practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the union of two sorted arrays. */
public class SortedUnionTest {

  @Test
  public void bothArraysEmpty() {
    assertUnion(new int[] {},
        SortedUnion.union(new int[] {}, new int[] {}));
  }

  @Test
  public void firstArrayEmpty() {
    assertUnion(new int[] {1, 2, 3},
        SortedUnion.union(new int[] {}, new int[] {1, 2, 3}));
  }

  @Test
  public void secondArrayEmpty() {
    assertUnion(new int[] {1, 2, 3},
        SortedUnion.union(new int[] {1, 2, 3}, new int[] {}));
  }

  @Test
  public void firstArrayEntirelyBeforeSecond() {
    assertUnion(new int[] {1, 2, 3, 4, 5, 6},
        SortedUnion.union(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
  }

  @Test
  public void disjointArraysInterleave() {
    assertUnion(new int[] {1, 2, 3, 4, 5, 6},
        SortedUnion.union(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
  }

  @Test
  public void identicalArraysGiveOneCopy() {
    assertUnion(new int[] {1, 2, 3},
        SortedUnion.union(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
  }

  @Test
  public void sharedValuesAppearOnce() {
    assertUnion(new int[] {1, 2, 3, 5, 6, 7, 9},
        SortedUnion.union(new int[] {1, 3, 5, 7}, new int[] {2, 3, 6, 7, 9}));
  }

  @Test
  public void sharedValueAtTheEndOfBoth() {
    assertUnion(new int[] {1, 2, 3, 4},
        SortedUnion.union(new int[] {1, 4}, new int[] {2, 3, 4}));
  }

  @Test
  public void negativesSortBeforePositives() {
    assertUnion(new int[] {-7, -3, 1, 4},
        SortedUnion.union(new int[] {-7, 1}, new int[] {-3, 1, 4}));
  }

  // Asserts that actual holds exactly the expected values, in order.
  private static void assertUnion(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
