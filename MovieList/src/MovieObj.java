
public class MovieObj  {
	
	protected int movieID;
	protected String movieTitle;
	protected int releaseYear;
	protected String movieDescription;
	protected String movieGenre;
	protected String movieDirector;

	public MovieObj(int movieID, String movieTitle, int releaseYear, String movieDescription, String movieGenre, String movieDirector){
		this.movieID = movieID;
		this.movieTitle = movieTitle;
		this.releaseYear = releaseYear;
		this.movieDescription = movieDescription;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
	}
	
	public String getTitle(){
	   return movieTitle;
	}

public void setTitle(String movieTitle)	{
	  this.movieTitle = movieTitle;
}

  public String getGenre()	{
  	return movieGenre;
 }

public void setGenre(String movieGenre) {
	this.movieGenre = movieGenre;
}

public String getDirector()	{
	return movieDirector;
  }  

public void setDirector(String movieDirector)	{
	this.movieDirector = movieDirector;
	}

public int getReleaseYear()	 {
	return releaseYear;
}

public void setReleaseYear(int releaseYear)  {
	this.releaseYear = releaseYear;
  }

public int getMovieID()  {
	return movieID;
	}

public void setMovieID(int movieID) {
	this.movieID = movieID;
	}

public String getDescription()	{
	return movieDescription;
	}

public void setDescription(String movieDescription) {
	this.movieDescription = movieDescription;
	}
}	
	

	