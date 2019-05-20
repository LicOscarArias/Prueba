/**
 * 
 */
package com.isba.memory;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author oarias
 *
 */
public class ConcurrentList implements ConcurrentMemoryStore {

	private Hashtable<String, Item> items;

	public ConcurrentList() {
		items = new Hashtable<String, Item>();
	}

	@Override
	public void store(String key, Item item) throws IllegalArgumentException {
		items.put(key, item);
	}

	@Override
	public void update(String key, int value1, int value2) {
		Item item = items.get(key);
		item.setValue1(value1);
		item.setValue2(value2);
	}

	@Override
	public Iterator<Item> valueIterator() {
		CopyOnWriteArrayList<Item> list = new CopyOnWriteArrayList<Item>(items.values()); 
		
		return list.iterator();
	}

	@Override
	public void remove(String key) {
		items.remove(key);
	}

}
