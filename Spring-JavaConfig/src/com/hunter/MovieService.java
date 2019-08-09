package com.hunter;

import java.util.ArrayList;
//import java.util.Iterator;



public class MovieService implements Movie{
	
	protected ArrayList<String> favMovies;
	public MovieService() {
		favMovies=new ArrayList<String>();
	}
	
	@Override
	public void addMovie(String movie) {
		favMovies.add(movie);
	}
	
}
