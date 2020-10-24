package edu.upb.ds.avl;

public class TreeNode {
    TreeNode left, right;
    int data;
    int height;

    public TreeNode()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }

    public TreeNode(int numero)
    {
        left = null;
        right = null;
        data = numero;
        height = 0;
    }
}
