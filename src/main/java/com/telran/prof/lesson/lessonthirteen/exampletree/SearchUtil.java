package com.telran.prof.lesson.lessonthirteen.exampletree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchUtil {
    public static void breadthFirstSearch(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.getValue() + " ");
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            System.out.println();
        }
    }

    public  static void dfsPostOrder(TreeNode node){
        if (node == null){
            return;
        }
        dfsPostOrder(node.getLeft());

        dfsPostOrder(node.getRight());

        System.out.print(node.getValue() + " ");
    }

    public static void dfsPreOrder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.getValue() + " ");

        dfsPostOrder(node.getLeft());
        dfsPreOrder(node.getRight());
    }
}
