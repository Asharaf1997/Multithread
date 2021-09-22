package Asharaf;

import java.util.Comparator;

public class Movie implements Comparable<Movie>
{
	String name;
	int year;
	double rating;
	int budget;
	String paltform;
	int tickprice;
	
	public Movie(String name,int year,double rating,long budget,String platform,int ticketprice)
	{
		this.name=name;
		this.year=year;
		this.rating=rating;
		this.paltform=platform;
	  	this.tickprice= tickprice;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", rating=" + rating + ", budget=" + budget + ", paltform="
				+ paltform + ", tickprice=" + tickprice + "]";
	}

	@Override
	public int compareTo(Movie o) {
		
		return this.year - o.year;
	}
	
	class SortByRating implements Comparator<Movie>
	{

		@Override
		public int compare(Movie o1, Movie o2)
		{
			
			if(o1.rating>o2.rating)
				return 1;
			else if(o1.rating<o2.rating)
				return -1;
			else
				return 0;
		}
		
	}
	
	class SortByPrice implements Comparator<Movie>
	{

		@Override
		public int compare(Movie o1, Movie o2)
		{
			
			if(o1.tickprice>o2.tickprice)
				return 1;
			else if(o1.tickprice<o2.tickprice)
				return -1;
			else
				return 0;
		}
		
	}
 
}
