/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.p.course.tree;

/**
 *
 * @author Shady.Salah
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverInorder();

        System.out.println();

        if (tree.get(27) != null) {
            System.out.println(tree.get(27).getData());
        }

        if (tree.get(17) != null) {
            System.out.println(tree.get(17).getData());
        }

        if (tree.get(8888) != null) {
            System.out.println(tree.get(8888).getData());
        }

        System.out.println("MAX : " + tree.getMAX());

        System.out.println("MIN : " + tree.getMIN());

    }
}
