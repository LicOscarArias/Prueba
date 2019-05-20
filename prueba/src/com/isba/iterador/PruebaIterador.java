/**
 * 
 */
package com.isba.iterador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author oarias
 *
 */
public class PruebaIterador {

	public static void main(String argv[]) {
		Integer [] a = {1,3,5,7,9};
		Integer [] b = {2,4,6,8};
		Integer [] c = {0,10,20,30};
		
		List<Integer> la = new ArrayList<Integer>(Arrays.asList(a)); 
		List<Integer> lb = new ArrayList<Integer>(Arrays.asList(b)); 
		List<Integer> lc = new ArrayList<Integer>(Arrays.asList(c)); 
		List<List<Integer>> total = new ArrayList<List<Integer>>();
		total.add(la);
		total.add(lb);
		total.add(lc);
 		
		Iterator<Integer> iterador =new Iterador<Integer>(total).iterator();

		while(iterador.hasNext()) {
			System.out.print(iterador.next() + " ");
		}
		
		
	}

}
