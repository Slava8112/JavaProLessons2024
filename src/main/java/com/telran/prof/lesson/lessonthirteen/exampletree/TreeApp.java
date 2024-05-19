package com.telran.prof.lesson.lessonthirteen.exampletree;

public class TreeApp {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, null, null);
        TreeNode left = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(13, null, null);
        root.setLeft(left);
        root.setRight(right);

        //    10
        //   /  \
        //  7   13

        CustomBinaryTree customBinaryTree = new CustomBinaryTree();
        customBinaryTree.add(7);
        customBinaryTree.add(4);
        customBinaryTree.add(9);
        customBinaryTree.add(2);
        customBinaryTree.add(5);
        customBinaryTree.add(8);
        customBinaryTree.add(10);
        customBinaryTree.add(12);
        /*
             7
          4      9
        2   5  8    10
                      12

         */

        SearchUtil.breadthFirstSearch(customBinaryTree.getRoot());

        System.out.println();

        SearchUtil.dfsPostOrder(customBinaryTree.getRoot());
        System.out.println();
        SearchUtil.dfsPreOrder(customBinaryTree.getRoot());

    }
}
