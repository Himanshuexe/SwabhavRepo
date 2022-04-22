package com.monocept.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements Iterable<T> {
	protected Node<T> head;
	protected Node<T> currentNode;

	public CustomLinkedList() {
	}

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.getNextNode();
		} else {
			Node<T> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(currentNode.getNextNode().getNextNode());
		}
	}

	public void display() {
		Node<T> currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNextNode();
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new CustomListIterator<T>();
	}

	public class CustomListIterator<T> implements Iterator<T> {
		private Node<T> previous;
		private Node<T> currentNode;

		public CustomListIterator() {
			super();
			this.currentNode = (Node<T>) head;
			this.previous = null;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null && currentNode.getNextNode() != null)
				return true;
			else
				return false;
		}

		@Override
		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			if (previous == null) {
				previous = currentNode;
				return previous.getData();
			}
			T node = currentNode.getData();
			currentNode = currentNode.getNextNode();
			return currentNode.getData();
		}

	}
}
