# Merge Sort — Practice

Two practice problems. `SortedUnion` takes the union of two sorted arrays, each with no duplicate values of its own, as a two-pointer walk like the merge. `MergeKSortedArrays` merges `k` sorted arrays into one, first one array at a time and then in pairs, recursively.

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
        MergeKSortedArrays.java         # merge k sorted arrays (2 solutions)
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
- `sorts.MergeTwoSortedArrays` — an unchanged copy from the chapter. `MergeKSortedArrays` calls its `merge`, so it is included here to keep this code self-contained.
- `practice.MergeKSortedArrays` — `mergeAllOneAtATime`, which folds each array into a running result, and `mergeAllPairwise`, which splits the list of arrays in half and merges recursively.
- `practice.MergeKSortedArraysTest` — the abstract scenario suite for merging `k` arrays. It has one subclass per solution, `MergeKSortedArraysOneAtATimeTest` and `MergeKSortedArraysPairwiseTest`, so you can test one solution alone.
