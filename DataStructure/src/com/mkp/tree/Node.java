package com.mkp.tree;

import java.util.ArrayList;
import java.util.List;


public class Node {

	
	private Node parent;
	private List<Node> childs = new ArrayList<>();
	private String id;
	Node(Node node ,String id){
		this.parent = node;
		this.id = id;
	}
	public Node getParent(){
		return parent;
	}
	public List<Node> getChils(){
		return childs;
	}
	public String getId(){
		return id;
	}
}
