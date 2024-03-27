package com.company.dataStructure.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrderBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1; // so that we can increment it and make it go toh the length of array

        // Need to traverse the whole array by using index
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) { // null Node
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // go to left node
            newNode.right = buildTree(nodes); // go to right node

            return newNode; // return root node
        }

    }

    // TIme complexity : O(N)
    public static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // TIme complexity : O(N)
    public static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    // TIme complexity : O(N)
    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    // TIme complexity : O(N)
    public static void levelOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    // TIme complexity : O(N)
    public static int countOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }


    // TIme complexity : O(N)
    public static int sumOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Time complexity : O(N)
    public static int heightOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        //System.out.println(root.data);
        int leftNodeHeight = heightOfNodes(root.left);
        //System.out.println(root.data);
        int rightNodeHeight = heightOfNodes(root.right);
        //System.out.println(root.data);

        int height = Math.max(leftNodeHeight, rightNodeHeight) + 1;
        return height;
    }

    // Time complexity : O(N^2) : Approach 1
    public static int diameter(Node root) {

        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);

        int dia3 = heightOfNodes(root.left) + heightOfNodes(root.right) + 1;

        return Math.max(dia3, Math.max(dia1, dia2));
    }

    static class TreeInfo {
        int diam;
        int ht;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Time complexity : O(N) : Approach 2
    public static TreeInfo diameter2 (Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.diam;
        int dia2 = right.diam;
        int dia3 = left.ht + right.ht + 1;

        int myDiameter = Math.max(Math.max(dia1, dia2), dia3);

        TreeInfo treeInfo = new TreeInfo(myHeight, myDiameter);
        return treeInfo;
    }

    public boolean isSubTree(Node root, Node subRoot) {

        // case when both trees are null also covered within this if block
        if (subRoot == null) {
            // since null node exists in every tree
            return true;
        }

        // case when only root is null
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {

            // check whether value of right subtree or left subtree match or not
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    private boolean isIdentical(Node root, Node subRoot) {

        // reached both tree's leaf node or check both tree's nullability
        if (root == null && subRoot == null) {
            return true;
        }

        // when any of the tree is null
        if (root == null || subRoot == null) {
            return false;
        }

        // both tree's left and right subtree's should be equal
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        // when even current node's value are not matching
        return false;
    }


    public static int sumOfNodeKthLevel(Node root) {
        return 0;
    }

    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree binaryTree = new BinaryTree();
        Node rootNode = binaryTree.buildTree(nodes);
        System.out.println(rootNode.data);

        System.out.print("Preorder Traversal : ");
        preOrder(rootNode);

        System.out.println();
        System.out.print("INorder Traversal : ");
        inOrder(rootNode);

        System.out.println();
        System.out.print("Postorder Traversal : ");
        postOrder(rootNode);

        System.out.println();
        System.out.println("Levelorder Traversal : ");
        levelOrderTraversal(rootNode);

        System.out.println("Count Of Nodes : " + countOfNodes(rootNode));

        System.out.println("Sum Of Nodes : " + sumOfNodes(rootNode));

        System.out.println("Height Of Tree : " + heightOfNodes(rootNode));

        System.out.println("Diameter Of Tree : " + diameter(rootNode));

        System.out.println("Diameter Of Tree Approach 2: " + diameter2(rootNode).diam);
    }
}
