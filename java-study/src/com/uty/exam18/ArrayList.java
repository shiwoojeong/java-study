package com.uty.exam18;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {
	private int size;
	private E[] data;

	public ArrayList() {
		this.size = 0;
		resize();
	}

	private void resize() {
		if (size == 0) {
			data = (E[]) new Object[10];
		} else {
			int newCapacity = size + (size >> 1);
			E[] newData = (E[]) new Object[newCapacity];
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	@Override
	public void add(E element) {
		if (data.length == size) {
			resize();
		}
		data[size++] = element;
	}

	@Override
	public void add(int index, E e) {
		checkBoundinclusive(index);
		if (size == data.length) {
			resize();
		}
		System.arraycopy(data, index, data, index + 1, size - index);
		data[index] = e;

		size++;

	}

	@Override
	public E get(int index) {
		checkBoundExclusive(index);
		return data[index];
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
	public E remove(int index) {
		checkBoundExclusive(index);
		E removedElement = data[index];
		System.arraycopy(data, index + 1, data, index, size - (index + 1));
		data[--size] = null;
		return removedElement;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		size = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			private int pos = 0;
			private int size = size();

			@Override
			public boolean hasNext() {
				return pos < size;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if (pos >= size) {
					throw new NoSuchElementException();
				}
				return data[pos++];
			}

		};
	}

}
