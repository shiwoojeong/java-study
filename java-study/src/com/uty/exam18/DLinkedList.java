package com.uty.exam18;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLinkedList<E> implements List<E> {
	private int size;
	private Node<E> head;
	private Node<E> tail;

	private class Node<E> {
		private Node<E> next;
		private Node<E> prev;
		private E data;

		private Node(E element) {
			this.data = element;
			this.next = null;
			this.prev = null;
		}
	}

	@Override
	public void add(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(element);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		checkBoundinclusive(index);
		if (index == size) {
			add(element);
			return;
		}

		Node<E> newNode = new Node<E>(element);

		Node<E> x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}

		if (index == 0) {
			newNode.prev = x.prev;
			x.prev = newNode;
			newNode.next = x;
			head = newNode;
		} else {
			x.prev.next = newNode;
			newNode.prev = x.prev;
			newNode.next = x;
			x.prev = newNode;
		}

		size++;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		Node<E> temp;
		checkBoundExclusive(index);

		// 인덱스가 앞쪽 절반에 해당하면 head부터 출발
		if (index < size / 2) {
			temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next; // 임시 변수만 이동!
			}
		}
		// 인덱스가 뒤쪽 절반에 해당하면 tail부터 출발
		else {
			temp = tail;
			for (int i = size - 1; i > index; i--) {
				temp = temp.prev; // 임시 변수만 이동!
			}
		}

		return temp.data;
	}

	@Override
	public E remove(int index) {
		checkBoundExclusive(index);
		Node<E> x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}

		if (index == 0) {
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				x.next.prev = x.prev;
				head = x.next;
			}
		} else if (x == tail) {
			x.prev.next = x.next;
			tail = x.prev;
		} else {
			x.prev.next = x.next;
			x.next.prev = x.prev;
		}
		size--;
		return x.data;

	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		Node<E> x = head;

		while (x != null) {
			Node<E> next = x.next;
			x.next = null;
			x.prev = null;
			x = next;
		}

		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	private void checkBoundExclusive(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
		}
	}

	private void checkBoundinclusive(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
		}
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			private Node<E> pos = head;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return (pos != null);
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if (pos == null)
					throw new NoSuchElementException();
				E data = pos.data;
				pos = pos.next;
				return data;
			}

		};
	}

}
