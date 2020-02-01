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
public class TreeNode {

    private int data;
    private TreeNode leftChaild;
    private TreeNode righhChaild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {

        if (value == data) {
            return;
        }

        if (value < data) {

            if (leftChaild == null) {
                leftChaild = new TreeNode(value);

            } else {
                // repeated
                leftChaild.insert(value);
            }
        } else {

            if (righhChaild == null) {

                righhChaild = new TreeNode(value);
            } else {

                righhChaild.insert(value);
            }
        }

    }

    public void traverInorder() {

        if (leftChaild != null) {

            leftChaild.traverInorder();
        }
        System.out.print(data + " , ");

        if (righhChaild != null) {

            righhChaild.traverInorder();
        }
    }

    public TreeNode get(int value) {

        if (value == this.data) {

            return this;
        }

        if (value < data) {

            // search in left
            if (leftChaild != null) {

                return leftChaild.get(value);
            }

        } else {

            // search in right
            if (righhChaild != null) {

                return righhChaild.get(value);
            }
        }

        return null;
    }

    public int getMAX() {

        if (righhChaild == null) {
            return data;
        } else {
            return righhChaild.getMAX();
        }
    }

    // Not implemented
    //094 Binary Search Trees (Implement Cases 1 and 2).mp4
    public void delete(int value){
    
        if(value == data){
        
        }
        
    }
    
    public int getMIN() {

        if (leftChaild == null) {
            return data;
        } else {
            return leftChaild.getMIN();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChaild() {
        return leftChaild;
    }

    public void setLeftChaild(TreeNode leftChaild) {
        this.leftChaild = leftChaild;
    }

    public TreeNode getRighhChaild() {
        return righhChaild;
    }

    public void setRighhChaild(TreeNode righhChaild) {
        this.righhChaild = righhChaild;
    }

}
