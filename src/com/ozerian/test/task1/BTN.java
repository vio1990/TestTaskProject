package com.ozerian.test.task1;


/**
 * This BTN class is for representation of binary tree node.
 * This class has it's int value field and and reference to
 * left and right tree nodes (BTN).
 */
public class BTN {

    private int val;

    private BTN left;

    private BTN right;

    public BTN(int val, BTN left, BTN right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public BTN getLeft() {
        return left;
    }

    public BTN getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BTN)) return false;

        BTN btn = (BTN) o;

        if (val != btn.val) return false;
        if (left != null ? !left.equals(btn.left) : btn.left != null) return false;
        return right != null ? right.equals(btn.right) : btn.right == null;

    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BTN{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
