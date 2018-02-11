package com.mkp.basic.tree.mirrorOfBinaryTree;


//Java program to convert binary tree into its mirror

/* Class containing left and right child of current
node and key value*/
class Node
{
 int data;
 Node left, right;

 public Node(int item)
 {
     data = item;
     left = right = null;
 }
}

public class MirrorOfBinaryTree
{
 Node root;

 void mirror()
 {
     root = mirror(root);
 }

 Node mirror(Node node)
 {
     if (node == null)
         return node;

     /* do the subtrees */
     Node left = mirror(node.left);
     Node right = mirror(node.right);

     /* swap the left and right pointers */
     node.left = right;
     node.right = left;

     return node;
 }

 void inOrder()
 {
     inOrder(root);
 }

 /* Helper function to test mirror(). Given a binary
    search tree, print out its data elements in
    increasing sorted order.*/
 void inOrder(Node node)
 {
     if (node == null)
         return;

     inOrder(node.left);
     System.out.print(node.data + " ");

     inOrder(node.right);
 }

 /* testing for example nodes */
 public static void main(String args[])
 {
     /* creating a binary tree and entering the nodes */
     MirrorOfBinaryTree mirrorTree = new MirrorOfBinaryTree();
     mirrorTree.root = new Node(1);
     mirrorTree.root.left = new Node(2);
     mirrorTree.root.right = new Node(3);
     mirrorTree.root.left.left = new Node(4);
     mirrorTree.root.left.right = new Node(5);

     /* print inorder traversal of the input Tree */
     System.out.println("Inorder traversal of input Tree is :");
     mirrorTree.inOrder();
     System.out.println("");

     /* convert mirrorTree to its mirror */
     mirrorTree.mirror();

     /* print inorder traversal of the minor mirrorTree */
     System.out.println("Inorder traversal of binary MirrorTree is : ");
     mirrorTree.inOrder();

 }
}