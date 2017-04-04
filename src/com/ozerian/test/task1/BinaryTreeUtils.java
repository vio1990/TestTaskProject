package com.ozerian.test.task1;

/**
 * BinaryTreeUtils is class with util
 * method for convenient working with binary trees.
 */
public final class BinaryTreeUtils {

    /**
     * isTreeAreEqual method is for comparison of two given
     * trees through recursion. The method returns "true" if
     * given trees are completely equal and "false" in other cases.
     *
     * @param firstTree  BTN first tree for comparison.
     * @param secondTree BTN second tree for comparison.
     * @return boolean "true" if trees are equal and "false" if tey aren't.
     */
    public static boolean isTreesAreEqualRecursive(BTN firstTree, BTN secondTree) {
        if (firstTree == null && secondTree == null) {
            return true;
        }

        if (firstTree != null && secondTree != null) {
            return (firstTree.getVal() == secondTree.getVal()
                    && isTreesAreEqualRecursive(firstTree.getLeft(), secondTree.getLeft())
                    && isTreesAreEqualRecursive(firstTree.getRight(), secondTree.getRight()));

        }

        return false;
    }
}
