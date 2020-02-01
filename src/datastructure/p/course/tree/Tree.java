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
public class Tree {

    private TreeNode root;

    public void insert(int value) {

        if (root == null) {

            root = new TreeNode(value);
        } else {

            root.insert(value);
        }
    }

    public void traverInorder() {

        if (root != null) {

            root.traverInorder();
        }
    }

    public TreeNode get(int value) {

        if (root != null) {

            return root.get(value);
        }

        return null;
    }

    public int getMIN() {

       if (root == null) {
            return Integer.MIN_VALUE;

        } else {
            return root.getMIN();
        }
    }

    public int getMAX() {

        if (root == null) {
            return Integer.MAX_VALUE;

        } else {
            return root.getMAX();
        }

    }
}
