package edu.upb.ds.avl;

public class Node {

    public Node left;
    public Node right;
    Object data;
    int height;

    public Node()
    {
        left = null;
        right = null;
        data = null;
        height = 0;
    }

    public Node(int numero)
    {
        left = null;
        right = null;
        data = numero;
        height = 1;
    }

}
//Developed by Pedro Gómez - ID:000396221