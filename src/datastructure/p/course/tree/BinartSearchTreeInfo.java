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
public class BinartSearchTreeInfo {

    /*
    
     Binary Tree:
    
     1: Every node has 0,1 or 2 children.
     2: children are refered as left child and right chaild.
     3: in practic, we use binary search tree.
    
     4: completed binary tree:        every node in each leve has 2 children except the last level & leafs
     5: fully completed binary tree : every node in each level has 2 children except the leafs.
    
    6: balance binary tree: keep the hights in left sub tree and the right sub tree don't differ by much.
    
    ---------------------------------------------------------------------------------------------------------
    
    Binary Search Tree :
    
    1: Can perform insertions, deletions and retrival in O(logn). ===> similar to Binary search on sorted array.
    2: the left chaild always has a smaller value than its perant.
    3: the right chaild always has a larger value than its perant.
    
    4: this means : everything is left of the root is smaller than tha value of the root,
                  : everyhing is right of the root is larger than the value of the root.
    
    Then : because of that we can do a binary search.
    
    5: its called binary tree because it is naturally organized so you can do binary search just by
        comparing the value with the node and depending on the result , going to the left or going to the right
    
    6: one important chrachteristic of binart tree quickly : 
      - you can get the minmum value by flowing the  left edges down.
      - you can get the maximum value by flowing the right edges down.
    
    7: insert 25, 20, 15, 10  : in this case the data is sorting in desending order.
    
    8: when you bulid binary tree : try to keep it balance.
    
    
     ---------------------------------------------------------------------------------------------------------

    Traversal :
    
    1: Level : visit node in each level [from root to leafs].
    
    2: Pre-order : visit the root of every sub tree first [then left then rigt].
    
    3: Post-order : visit the root of every sub tree last.
    
    4: in-Order : visit left chaild, then root, then right chaild.
    
    
     */
}
