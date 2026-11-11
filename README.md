# Merge Sort — Practice

Two practice problems. `SortedUnion` takes the union of two sorted arrays, each with no duplicate values of its own, as a two-pointer walk like the merge. The second problem merges `k` sorted arrays into one, first one array at a time (`MergeKSortedArraysOneAtATime`) and then in pairs, recursively (`MergeKSortedArraysPairwise`).

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      sorts/
        MergeTwoSortedArrays.java       # the two-array merge (copied from the chapter)
      practice/
        SortedUnion.java                # union of two sorted arrays
        MergeKSortedArraysOneAtATime.java  # merge k sorted arrays, one at a time
        MergeKSortedArraysPairwise.java    # merge k sorted arrays, in pairs
    test/
      practice/
        SortedUnionTest.java
        MergeKSortedArraysTest.java     # abstract: the merge-k scenarios
        MergeKSortedArraysOneAtATimeTest.java
        MergeKSortedArraysPairwiseTest.java
  scripts/
    test.sh                             # compile and run every JUnit test
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh practice.MergeKSortedArraysPairwiseTest` — compiles everything and runs only that test class. Use this while you are working on one problem or one solution and the others are still empty.

There is no demo program for these problems; the tests are how you check your work.

## What's here

- `practice.SortedUnion` — `union(arr1, arr2)`, which returns a new sorted array of every value in either input, each value once.
- `practice.SortedUnionTest` — tests for `SortedUnion`.
- `sorts.MergeTwoSortedArrays` — an unchanged copy from the chapter. Both merge k solutions call its `merge`, so it is included here to keep this code self-contained.
- `practice.MergeKSortedArraysOneAtATime` — `mergeAll`, which folds each array into a running result.
- `practice.MergeKSortedArraysPairwise` — `mergeAll`, which splits the list of arrays in half and merges recursively.
- `practice.MergeKSortedArraysTest` — the abstract scenario suite for merging `k` arrays. It has one subclass per solution, `MergeKSortedArraysOneAtATimeTest` and `MergeKSortedArraysPairwiseTest`, so you can test one solution alone.
