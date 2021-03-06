package com.monocept.model;

public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return next;
	}

	public void setNextNode(Node<T> nextNode) {
		this.next = nextNode;
	}

}
