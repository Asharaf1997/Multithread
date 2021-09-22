package Asharaf;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
//import java.util.List;

//import Asharaf.Movie.SortByPrice;

public class Mv
{

	public static void main(String[] args)
	{
		LinkedList<Movie> llm = new LinkedList<Movie>();
		
		llm.add(new Movie("PK",2018,4.5,200,"PVR",500));
		llm.add(new Movie("SRK",2012,5.0,100,"All Steam",350));
		llm.add(new Movie("WWE",2010,3.5,200,"NTP",150));
		
		Comparator<Movie> SortByPrice = new Comparator<Movie>() {
			
			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.tickprice>o2.tickprice)
					return 1;
				else if(o1.tickprice<o2.tickprice)
					return -1;
				else return 0;
			}
		};


		Comparator<Movie> SortByRating = new Comparator<Movie>() {
			
			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.rating>o2.rating)
					return 1;
				else if(o1.rating<o2.rating)
					return -1;
				else return 0;
			}
		};

		System.out.println("Before sorting Movies");
		printMovies(llm);



		Collections.sort(llm, SortByRating );

		System.out.println("After sorting Movies");
		printMovies(llm);

			}
			
			static void printMovies(LinkedList<Movie> pm){
				
				for(Movie m: pm)
					System.out.println(m);
				
				System.out.println("******************");
			}

		}