/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagee;

/**
 *
 * @author wesle
 */
public class Node<T> {

    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeft(Node<T> node) {
        this.left = node;
    }

    public void setRight(Node<T> node) {
        this.right = node;
    }
}
