package edu.upb.ds.avl;

public class AVLTree {
    public Node root;
    public void preOrden(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrden(root.left);
        preOrden(root.right);
    }

    public void inOrden(Node root) {
        if(root == null) {
            return;
        }
        inOrden(root.left);
        System.out.print(root.data + " ");
        inOrden(root.right);
    }

    public void posOrden(Node root) {
        if(root == null) {
            return;
        }
        posOrden(root.left);
        posOrden(root.right);
        System.out.print(root.data + " ");
    }
    int getBalance(Node N) {
        if (N == null)
            return 0;

        return alturaArbol(N.left) - alturaArbol(N.right);
    }
    int alturaArbol(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }
    int numeroMayor(int a, int b) {
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public Node rotarDerecha(Node nodo) {
        Node nodoIzquierdo = nodo.left;
        Node nodoDerecho = nodoIzquierdo.right;
        nodoIzquierdo.right = nodo;
        nodo.left = nodoDerecho;
        nodo.height = numeroMayor(alturaArbol(nodo.left), alturaArbol(nodo.right)) + 1;
        nodoIzquierdo.height = numeroMayor(alturaArbol(nodoIzquierdo.left), alturaArbol(nodoIzquierdo.right)) + 1;

        return nodoIzquierdo;
    }
    public Node rotarIzquierda(Node nodo) {
        Node nodoDerecho = nodo.right;
        Node nodoIzquierdo = nodoDerecho.left;
        nodoDerecho.left = nodo;
        nodo.right = nodoIzquierdo;
        nodo.height = numeroMayor(alturaArbol(nodo.left),alturaArbol(nodo.right)) + 1;
        nodoDerecho.height = numeroMayor(alturaArbol(nodoDerecho.left),alturaArbol(nodoDerecho.right)) + 1;
        return nodoDerecho;
    }
    public Node insertar(Node node, int key) {
        if (node == null){
            return (new Node(key));}
        else{
        if (key < (int)node.data){
            node.left = insertar(node.left, key);
        }
        else if (key > (int) node.data){
            node.right = insertar(node.right, key);
        }
        else{
            return node;
            }
        }

        node.height = 1 + numeroMayor(alturaArbol(node.left), alturaArbol(node.right));

        //Obtener balance para saber si lo estaá
        int balance = getBalance(node);

        //4 casos de cuando el árbol no esta balanceado
        if (balance > 1 && key < (int) node.left.data) {
            return rotarDerecha(node);
        }

        // DERECHA , DERECHA
        if (balance < -1 && key > (int) node.right.data) {
            return rotarIzquierda(node);
        }

        // IZQUIERDA,DERECHA
        if (balance > 1 && key > (int) node.left.data) {
            node.left = rotarIzquierda(node.left);
            return rotarDerecha(node);
        }

        // DERECHA,IZQUIERDA
        if (balance < -1 && key < (int) node.right.data) {
            node.right = rotarDerecha(node.right);
            return rotarIzquierda(node);
        }
        return node;
    }
}
