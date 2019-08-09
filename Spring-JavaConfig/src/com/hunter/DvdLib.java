package com.hunter;

//import java.util.ArrayList;
import java.util.Iterator;



public class DvdLib extends MovieService implements movieLib {


	
	@Override
	public void showAllMovies() {
		System.out.println("Hello");
		Iterator<String> it=favMovies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
