/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagee;

/**
 * @author wesle
 */
public class Main {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree();

        tree.addNode(50);
        tree.addNode(40);
        tree.addNode(30);
        tree.addNode(36);
        System.out.println("***************************");
        tree.inOrder(tree.getRoot());
        System.out.println("***************************");
        tree.preOrder(tree.getRoot());
        System.out.println("***************************");
        tree.posOrder(tree.getRoot());
        tree.deleteNode(40);
        System.out.println("***************************");
        tree.inOrder(tree.getRoot());

    }
}
