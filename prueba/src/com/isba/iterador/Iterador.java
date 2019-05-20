/**
 * 
 */
package com.isba.iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author oarias
 *
 */
public class Iterador<T> implements Iterable<T> {
	T[] items;
	private int cantidadItems;
	
	/**
	 * @param t
	 */
	@SuppressWarnings("unchecked")
	public Iterador(List<List<T>> t) {
	    
		Stream<T> resultado = new ArrayList<T>().stream();
		for(List<T> l : t) {
		    Stream<T> random2 = l.stream();
		    resultado = Stream.concat(resultado, random2).sorted();
		}
	    items = (T[]) resultado.collect(Collectors.toList()).toArray();
	    cantidadItems = items.length;
	}

	@Override
	public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {

            private int posicionActual = 0;

            @Override
            public boolean hasNext() {
                return posicionActual < cantidadItems && items[posicionActual] != null;
            }

            @Override
            public T next() {
                return items[posicionActual++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iter;
    }

}
