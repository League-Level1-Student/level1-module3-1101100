package _05_netflix;

public class netflux {
	public static void main(String[] args) {
		
	Movie m1 = new Movie("movie1", 5);
	Movie m2 = new Movie("movie2", 4);
	Movie m3 = new Movie("movie3twilight", 3);
	Movie m4 = new Movie("movie4", 2);
	Movie m5 = new Movie("movie5", 1);
	
	String ah = m1.getTicketPrice();
	String ah1 = m3.getTicketPrice();
	String ah2 = m4.getTicketPrice();
	String ah3 = m5.getTicketPrice();
	
	System.out.println(ah);
	System.out.println(ah1);
	System.out.println(ah2);
	System.out.println(ah3);
	
	NetflixQueue nf = new NetflixQueue();
	
	nf.addMovie(m1);
	nf.addMovie(m3);
	nf.addMovie(m4);
	nf.addMovie(m5);

	nf.sortMoviesByRating();
	nf.printMovies();
	System.out.println("The best movie is " + nf.getBestMovie());
	System.out.println("The second best movie is " + nf.getMovie(1));
		
	}
}
