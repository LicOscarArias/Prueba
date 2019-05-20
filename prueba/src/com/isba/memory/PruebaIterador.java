/**
 * 
 */
package com.isba.memory;

import java.util.Iterator;

/**
 * @author oarias
 *
 */
public class PruebaIterador {

	public static void main(String argv[]) {
		
		ConcurrentList lista = new ConcurrentList();
		
		lista.store("val1",new Item(1,2));
		lista.store("val2",new Item(2,3));
		lista.store("val3",new Item(3,4));
		lista.store("val4",new Item(4,5));

		Iterator<Item> iterador = lista.valueIterator();

		while(iterador.hasNext()) {
			Item i = iterador.next();
		
			System.out.print(i + " ");
			if(i.getValue1() == 3) {
				lista.store("val5",new Item(5,6));
			}
			if(i.getValue1() == 4) {
				lista.store("val6",new Item(6,7));
			}

		}
		
		System.out.println("Vemos si se agregó");
		iterador = lista.valueIterator();

		while(iterador.hasNext()) {
			Item i = iterador.next();
		
			System.out.print(i + " ");
		}		
		
	}

}
