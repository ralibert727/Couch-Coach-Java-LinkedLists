

public class MoviePeopleObj {
	
	protected int personID;
	protected String name;
	protected String position; //whether or not this person is an actor or director
	protected String featuredMovies; //For actors, this includes the roles they played in movies
	
	public MoviePeopleObj(int personID, String name, String position,String featuredMovies) {
		this.personID = personID;
		this.name = name;
		this.position = position;
		this.featuredMovies = featuredMovies; 
    }
	
	public void setpersonID(int personID)  {
		this.personID = personID;
	  }
	
	public int getpersonID()	 {
		return personID;
	}
	
	public void setname(String name) {
		this.name = name;
	}

	public String getname()	{
		return name;
	  }  

	public void setPosition(String position)	{
		this.position = position;
		}

	public String getposition()	 {
		return position;
	}
	
	public void setfeaturedMovies(String featuredMovies)	{
		this.featuredMovies = featuredMovies;
		}

	public String getfeaturedMovies()	 {
		return featuredMovies;
	}

	
}
