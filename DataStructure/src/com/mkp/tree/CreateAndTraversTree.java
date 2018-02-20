package com.mkp.tree;

import java.util.List;

public class CreateAndTraversTree {
	
public static void main(String[] args) {
	
	Node root    = new Node(null,"root");
	Node child1  = new Node(root,"child1");
	Node child11 = new Node(child1,"child11");
	Node child12 = new Node(child1,"child12");
	Node child2  = new Node(root,"child2");
	Node child21 = new Node(child2,"child21");
	
	addNode(root, child1);
	addNode(root, child2);
	addNode(child1, child11);
	addNode(child1, child12);
	addNode(child2, child21);
	
	printTree(root, " ");
}

public static void addNode(Node parent, Node child){
	parent.getChils().add(child);
}

public static void printTree(Node node, String appender){

	System.out.println(appender + node.getId());
// here node.getChils() List<Node> doesn't have element 
//	then foreach loop will not execute instead of giving error.
	for (Node element : node.getChils()) {
		System.out.print(element.getChils().size());
		printTree(element, appender + appender);
		
	}
}

}
