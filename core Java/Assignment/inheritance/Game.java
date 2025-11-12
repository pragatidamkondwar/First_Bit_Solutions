 class Game {
 int  gameid;
 String name;
 String genre;
 double rating;
 int players;
 String publisher;
 
 Game() {
	 System.out.println("\ndefault constructor");
}

 Game(int gameid, String name, String genre, double rating, int players, String publisher) {
	super();
	System.out.println("\nparameterized constructor");
	this.gameid = gameid;
	this.name = name;
	this.genre = genre;
	this.rating = rating;
	this.players = players;
	this.publisher = publisher;
}

 int getGameid() {
	return gameid;
}

 void setGameid(int gameid) {
	this.gameid = gameid;
}

String getName() {
	return name;
}

 void setName(String name) {
	this.name = name;
}

 String getGenre() {
	return genre;
}

 void setGenre(String genre) {
	this.genre = genre;
}

 double getRating() {
	return rating;
}

 void setRating(double rating) {
	this.rating = rating;
}

 int getPlayers() {
	return players;
}

 void setPlayers(int players) {
	this.players = players;
}

 String getPublisher() {
	return publisher;
}

 void setPublisher(String publisher) {
	this.publisher = publisher;
}
 void display()
 {
	 System.out.println("gameid" + this. gameid);
	 System.out.println("name" + this.name);
	 System.out.println("genre" + this.genre);
	 System.out.println("rating" + this.rating);
	 System.out.println("players" + this.players);
	 System.out.println("publisher" + this.publisher);
 }
}
class videogame extends Game
{
	String Graphicsquality;
	String developer;
	String platform;
	String storagerequired;
	String engineused;
	
	 videogame() {
		super();
		System.out.println("\ndefault constructor");
	}

	 videogame(int gameid, String name, String genre, double rating, int players, String publisher,String graphicsquality, String developer, String platform, String storagerequired,
			String engineused) {
		super( gameid,  name,  genre,  rating, players, publisher);
		System.out.println("\nparameterized constructor");
		this.Graphicsquality = graphicsquality;
		this.developer = developer;
		this.platform = platform;
		this.storagerequired = storagerequired;
		this.engineused = engineused;
	}

	 String getGraphicsquality() {
		return Graphicsquality;
	}

	 void setGraphicsquality(String graphicsquality) {
		Graphicsquality = graphicsquality;
	}

	String getDeveloper() {
		return developer;
	}

	void setDeveloper(String developer) {
		this.developer = developer;
	}

	 String getPlatform() {
		return platform;
	}

	 void setPlatform(String platform) {
		this.platform = platform;
	}

    String getStoragerequired() {
		return storagerequired;
	}

	 void setStoragerequired(String storagerequired) {
		this.storagerequired = storagerequired;
	}

	 String getEngineused() {
		return engineused;
	}

	 void setEngineused(String engineused) {
		this.engineused = engineused;
	}
	void display()
	{
		super.display();
		System.out.println("graphicsquality" + this.Graphicsquality);
		System.out.println("developer" + this.developer);
		System.out.println("platform" + this.platform);
		System.out.println("storagerequired" + this.storagerequired);
		System.out.println("engineused" + this.engineused);
	}
	
}
class Boardgame extends Game
{
	int boardsize;
	int totalpiece;
	String material;
	String theme;
	int numberofRounds;
	
	 Boardgame() {
	 super();
	 System.out.println("\ndefault constructor");
	}

	Boardgame(int gameid, String name, String genre, double rating, int players, String publisher,int boardsize, int totalpiece, String material, String theme, int numberofRounds)
	{
		super( gameid,  name,  genre,  rating, players, publisher);
		System.out.println("\nparameterized constructor");
		this.boardsize = boardsize;
		this.totalpiece = totalpiece;
		this.material = material;
		this.theme = theme;
		this.numberofRounds = numberofRounds;
	}

	 int getBoardsize() {
		return boardsize;
	}

	 void setBoardsize(int boardsize) {
		this.boardsize = boardsize;
	}

	 int getTotalpiece() {
		return totalpiece;
	}

	 void setTotalpiece(int totalpiece) {
		this.totalpiece = totalpiece;
	}

	 String getMaterial() {
		return material;
	}

	 void setMaterial(String material) {
		this.material = material;
	}

	String getTheme() {
		return theme;
	}

	 void setTheme(String theme) {
		this.theme = theme;
	}

	int getNumberofRounds() {
		return numberofRounds;
	}

	 void setNumberofRounds(int numberofRounds) {
		this.numberofRounds = numberofRounds;
	}
	void display()
	{
		super.display();
		System.out.println("boardsize" + this.boardsize);
		System.out.println("totalpiece" + this.totalpiece);
		System.out.println("material" + this.material);
		System.out.println("theme" + this.theme);
		System.out.println("numberofrounds" + this.numberofRounds);
	}
}
class outdoorgame extends Game
{
	String fieldtype;
	int gameduration;
	String safetylevel;
	String whethercondition;
	String venueType;
	
	outdoorgame() {
		super();
		System.out.println("\ndefault constructor");
	}

	outdoorgame(int gameid, String name, String genre, double rating, int players, String publisher,String fieldtype, int gameduration, String safetylevel, String whethercondition,
			String venueType) {
		super( gameid,  name,  genre,  rating, players, publisher);
		System.out.println("\nparameterized constructor");
		this.fieldtype = fieldtype;
		this.gameduration = gameduration;
		this.safetylevel = safetylevel;
		this.whethercondition = whethercondition;
		this.venueType = venueType;
	}

	String getFieldtype() {
		return fieldtype;
	}

	 void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
	}

	 int getGameduration() {
		return gameduration;
	}

	 void setGameduration(int gameduration) {
		this.gameduration = gameduration;
	}

	 String getSafetylevel() {
		return safetylevel;
	}

	 void setSafetylevel(String safetylevel) {
		this.safetylevel = safetylevel;
	}

	 String getWhethercondition() {
		return whethercondition;
	}

	 void setWhethercondition(String whethercondition) {
		this.whethercondition = whethercondition;
	}

	 String getVenueType() {
		return venueType;
	}

	 void setVenueType(String venueType) {
		this.venueType = venueType;
	}
	void display()
	{
		super.display();
		System.out.println("fieldtype" + this.fieldtype);
		System.out.println("gameduration" + this.gameduration);
		System.out.println("safetylevel" + this.safetylevel);
		System.out.println("whethercondition" + this.whethercondition);
		System.out.println("venuetype" + this.venueType);
	}
	
}
class DemoGame
{
	public static void main(String[] args) {
		Game g1=new Game();
		g1.display();
		
		Game g2=new Game(101, "GTA V", "Action", 4.8, 5, "pc");
		g2.display();
		
		 videogame v1 = new videogame();
		 v1.display();
		 
		
		 videogame v2 = new videogame(201, "GTA V", "Action-Adventure", 4.9, 1, "Rockstar Games",
		            "Ultra HD", "Rockstar North", "PC", "90 GB", "RAGE Engine");
		 v2.display();
		 
		 
		Boardgame b1= new Boardgame();
		b1.display();
		
		Boardgame b2= new Boardgame(  301, "Chess", "Strategy", 4.7, 2, "Hasbro",
	            8, 32, "Wood", "Classic Battle", 10);
		b2.display();
		
		outdoorgame  o1 = new outdoorgame();
		o1.display();
		
		outdoorgame  o2 = new outdoorgame( 401, "Cricket", "Sports", 4.9, 11, "ICC",
	            "Grass Field", 300, "High", "Sunny", "Stadium");
		o2.display();
	}
}
