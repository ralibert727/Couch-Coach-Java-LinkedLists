import java.util.*;

public class MovieLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MovieObj> list = new LinkedList<MovieObj>();
		
		//Movie Descriptions are from IMDB
		//Action Movies
		MovieObj a1 = new MovieObj(0, "Venom", 2018, "A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and"
				+ " decides to protect it.", "Action", "Ruben Fleischer");
		
		MovieObj a2 = new MovieObj(1,"John Wick Chapter 2", 2017, "After returning to the criminal underworld to repay a debt, John Wick discovers that a large bounty has been put on his life.", "Action", "John Stahelski");
	
		MovieObj a3 = new MovieObj(2, "Kingsman: The Golden Circle", 2017, "When their headquarters are destroyed and the world is held hostage, the Kingsman's journey leads them to the discovery of an allied spy organization in the United States. "
				+ "These two elite secret organizations must band together to defeat a common enemy.", "Action","Mattew Vaughn" );
		
		MovieObj a4 = new MovieObj(3, "Deadpool 2", 2018, " Foul-mouthed mutant mercenary Wade Wilson (a.k.a. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities "
				+ "from the brutal, time-traveling cyborg Cable.", "Action", "David Leitch");
	
		MovieObj a5 = new MovieObj(4, "12 Strong", 2018, " 12 Strong tells the story of the first Special Forces team deployed to Afghanistan after 9/11; under the leadership of a new captain, "
				+ "the team must work with an Afghan warlord to take down the Taliban.", "Action", "Nicolai Fuglsig");
	
		MovieObj a6 = new MovieObj(5, "Aquaman", 2018, "Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent"
				+ " a war between the worlds of ocean and land. ", "Action", "James Wan");
		
		MovieObj a7 = new MovieObj(6, "Spiderman: Into the Spiderverse", 2018, "Teen Miles Morales becomes Spider-Man of his reality, crossing his path with five counterparts from other"
				+ " dimensions to stop a threat for all realities.", "Action", "Rodney Rotham");
		
		//Drama Movies
		MovieObj b1 = new MovieObj(7, "Bohemian Rhapsody", 2018, "The story of the legendary British rock band Queen and lead singer Freddie Mercury, "
				+ "leading up to their famous performance at Live Aid (1985).", "Drama", "Bryan Singer");
		
		MovieObj b2 = new MovieObj(8, "Dunkirk", 2017, "Allied soldiers from Belgium, the British Empire, and France are surrounded by the German Army, "
				+ "and evacuated during a fierce battle in World War II.", "Drama", "Christopher Nolan");
		
		MovieObj b3 = new MovieObj(9, "Hacksaw Ridge", 2016, "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people, "
				+ "and becomes the first man in American history to receive the Medal of Honor without firing a shot.", "Drama", "Mel Gibson");
		
		MovieObj b5 = new MovieObj(10, "A Star is Born", 2019, "A musician helps a young singer find fame as age "
				+ "and alcoholism send his own career into a downward spiral.", "Drama", "Bradley Cooper");
		
		MovieObj b6 = new MovieObj(11, "The Accountant", 2016, "As a math savant uncooks the books for a new client, the Treasury Department closes in "
				+ "on his activities, and the body count starts to rise.", "Drama", "Gavin O'Connor");
		
		MovieObj b7 = new MovieObj(12, "The Martian", 2015, "An astronaut becomes stranded on Mars after his team assume him dead, "
				+ "and must rely on his ingenuity to find a way to signal to Earth that he is alive.", "Drama", "Ridley Scott");
		
		MovieObj b8 = new MovieObj(13, "Joker", 2019, "In Gotham City, mentally-troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime."
				+ " This path brings him face-to-face with his alter-ego: \"The Joker\".", "Drama", "Todd Philips");
		
		//Animated Movies
		MovieObj c1 = new MovieObj(14, "Moana", 2016, "In Ancient Polynesia, when a terrible curse incurred by the Demigod Maui reaches Moana's island, "
				+ "she answers the Ocean's call to seek out the Demigod to set things right.", "Animated", "Ron Clements");
		
		MovieObj c2 = new MovieObj(15, "Incredibles 2", 2018, "The Incredibles hero family takes on a new mission, which involves a change in family roles: "
				+ "Bob Parr (Mr Incredible) must manage the house while his wife Helen (Elastigirl) goes out to save the world.", "Animated", "Brad Bird");
		
		MovieObj c3 = new MovieObj(16, "Toy Story 4", 2019, "When a new toy called \"Forky\" joins Woody and the gang, "
				+ "a road trip alongside old and new friends reveals how big the world can be for a toy.", "Animated", "Tom Cooley");
		
		MovieObj c4 = new MovieObj(17, "Ralph Breaks the Internet", 2018, "Six years after the events of \"Wreck-It Ralph,\" Ralph and Vanellope, now friends, discover a wi-fi router in their arcade,"
				+ " leading them into a new adventure.", "Animated", "Rich Moore");
		
		MovieObj c6 = new MovieObj(18, "Kung Fu Panda 3", 2017, "Continuing his \"legendary adventures of awesomeness\", Po must face two hugely epic, "
				+ "but different threats: one supernatural and the other a little closer to home.", "Animated", "Jennifer Yu Nelson");
	
		MovieObj c7 = new MovieObj(19, "Hotel Transylvania 3: Summer Vaction", 2018, "Count Dracula and company participate in a cruise for sea-loving monsters, "
				+ "unaware that their boat is being commandeered by the monster-hating Van Helsing family.", "Animated", "Genndy Tartakovsky");
		
		MovieObj c8 = new MovieObj(20, "The Lego Batman Movie", 2017, "A cooler-than-ever Bruce Wayne must deal with the usual suspects as they plan to rule Gotham City, "
				+ "while discovering that he has accidentally adopted a teenage orphan who wishes to become his sidekick.", "Animated", "Chris McKay");
		
		//Horror films
		MovieObj d1 = new MovieObj(21, "Split", 2017, "Three girls are kidnapped by a man with a diagnosed 23 distinct personalities. "
				+ "They must try to escape before the apparent emergence of a frightful new 24th.", "Horror", "M. Night Shyamalan");
		
		MovieObj d3 = new MovieObj(22, "The Conjuring 2", 2016, "Ed and Lorraine Warren travel to North London to help a single mother raising "
				+ "4 children alone in a house plagued by a supernatural spirit.", "Horror", "James Wan");
		
		MovieObj d4 = new MovieObj(23, "Bird Box", 2018, "Five years after an ominous unseen presence drives most of society to suicide, "
				+ "a mother and her two children make a desperate bid to reach safety.", "Horror", "Susanne Bier");
		
		MovieObj d5 = new MovieObj(24, "A Cure for Wellness", 2017, "An ambitious young executive is sent to retrieve his company's CEO from an idyllic but mysterious \"wellness center\" at a remote location in the Swiss Alps,"
				+ " but soon suspects that the spa's treatments are not what they seem.", "Horror", "Gore Verbinski");
	
		MovieObj d6 = new MovieObj(25, "Raw", 2016, "An innocent teenager, studying to be a vet,"
				+ " develops a craving for human flesh.", "Horror", "Julia Ducournau");
		
		MovieObj d7 = new MovieObj(26, "Hereditary", 2018, "A grieving family is haunted by tragic and disturbing occurrences.", "Horror", "Ari Aster");
		
		MovieObj d8 = new MovieObj(27, "Halloween", 2018, "Laurie Strode confronts her long-time foe Michael Myers, the masked figure who has haunted her since "
				+ "she narrowly escaped his killing spree on Halloween night four decades ago.", "Horror", "David Gordon Green");
		
		//Science-Fiction movies
		MovieObj e1 = new MovieObj(28, "Solo: A Star Wars Story", 2018, "During an adventure into the criminal underworld, Han Solo meets his future co-pilot Chewbacca "
				+ "and encounters Lando Calrissian years before joining the Rebellion.", "Sci-Fi", "Ron Howard");
		
		MovieObj e2 = new MovieObj(29, "Rogue One: A Star Wars Story", 2016, "The daughter of an Imperial scientist joins the Rebel Alliance "
				+ "in a risky move to steal the Death Star plans.", "Sci-Fi", "Gareth Edwards");
		
		MovieObj e3 = new MovieObj(30, "Passengers", 2016, "A spacecraft traveling to a distant colony planet and transporting thousands of people has a malfunction in its sleep chambers."
				+ " As a result, two passengers are awakened 90 years early.", "Sci-Fi", "Morten Tyldum");
		
		MovieObj e4 = new MovieObj(31, "Ready Player One", 2018, "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, "
				+ "which will give the finder his fortune and control of his world.", "Sci-Fi", "Steven Spielberg");
	
		MovieObj e5 = new MovieObj(32, "Alien Covenant", 2017, "The crew of a colony ship, bound for a remote planet, discover an uncharted paradise with a threat "
				+ "beyond their imagination, and must attempt a harrowing escape.", "Sci-Fi", "Ridley Scott");
		
		MovieObj e6 = new MovieObj(33, "Blade Runner 2049", 2017, "A young blade runner's discovery of a long-buried secret leads him to track down former blade runner Rick Deckard, "
				+ "who's been missing for thirty years.", "Sci-Fi", "Denis Villeneuve");
		
		MovieObj e7 = new MovieObj(34, "Jurassic World: Fallen Kingdom", 2018, "When the island's dormant volcano begins roaring to life, "
				+ "Owen and Claire mount a campaign to rescue the remaining dinosaurs from this extinction-level event.", "Sci-Fi", "J.A. Bayona");
		
		//Action
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		
		//Drama
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		
		//Animated
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c6);
		list.add(c7);
		list.add(c8);
		
		//Horror
		list.add(d1);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
		list.add(d7);
		list.add(d8);
		
		//Science-Fiction
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		for(MovieObj m:list) {
			System.out.println(m.movieTitle + ", " + m.releaseYear + ", " + m.movieDescription + ", " + m.movieGenre + ", " + m.movieDirector + " ");
			System.out.println();
		}   
   	}
}


