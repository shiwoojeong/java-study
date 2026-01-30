package com.uty.exam18;

public class DLLStack<E> extends DLinkedList<E> {
	public void push(E item) {
		add(item);
	}

	public E pop() {
		if (size() == 0) {
			throw new StackException("Stack is empty");
		}
		return remove(size() - 1);
	}

	public E peek() {
		return get(size() - 1);
	}

	public boolean empty() {
		return size() == 0;
	}

}
