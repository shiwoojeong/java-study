package com.uty.exam18;

import java.util.Iterator;

public interface List<E> extends Iterable<E>{
	void add(E e);

	void add(int index, E e);

	E get(int index);

	E remove(int index);

	void removeAll();

	int size();

	
	

}
