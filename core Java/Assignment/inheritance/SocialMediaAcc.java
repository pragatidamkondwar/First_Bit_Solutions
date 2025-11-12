 class SocialMediaAcc {
	 String username;
		String email;
		String is_public;
		String is_verified;
		String country_origin;
		int no_of_post;
		int like;
		int comments;
		int created_at;
		int no_of_impression;
	

		 SocialMediaAcc() {
			 System.out.println("\ndefault constructor");
			this.username = "not given";
			this.email = "not given";
			this.is_public = "not given";
			this.is_verified = "not given";
			this.country_origin = "not given";
			this.no_of_post = 0;
			this.like = 0;
			this.comments = 0;
			this.created_at = 0;
			this.no_of_impression = 0;
		}// default
	
	 SocialMediaAcc(String username, String email, String is_public, String is_verified, String country_origin,
			int no_of_post, int like, int comments, int created_at, int no_of_impression) {
		 System.out.println("\nparameterized constructor");
		this.username = username;
		this.email = email;
		this.is_public = is_public;
		this.is_verified = is_verified;
		this.country_origin = country_origin;
		this.no_of_post = no_of_post;
		this.like = like;
		this.comments = comments;
		this.created_at = created_at;
		this.no_of_impression = no_of_impression;
	}// parameterized


	 String getUsername() {
		return username;
	}


	void setUsername(String username) {
		this.username = username;
	}


	 String getEmail() {
		return email;
	}


	 void setEmail(String email) {
		this.email = email;
	}


	 String getIs_public() {
		return is_public;
	}


	 void setIs_public(String is_public) {
		this.is_public = is_public;
	}


	 String getIs_verified() {
		return is_verified;
	}


	 void setIs_verified(String is_verified) {
		this.is_verified = is_verified;
	}


	 String getCountry_origin() {
		return country_origin;
	}


	 void setCountry_origin(String country_origin) {
		this.country_origin = country_origin;
	}


	 int getNo_of_post() {
		return no_of_post;
	}


	 void setNo_of_post(int no_of_post) {
		this.no_of_post = no_of_post;
	}


	 int getLike() {
		return like;
	}


	 void setLike(int like) {
		this.like = like;
	}


	 int getComments() {
		return comments;
	}


	 void setComments(int comments) {
		this.comments = comments;
	}


	 int getCreated_at() {
		return created_at;
	}


	 void setCreated_at(int created_at) {
		this.created_at = created_at;
	}


	int getNo_of_impression() {
		return no_of_impression;
	}


	 void setNo_of_impression(int no_of_impression) {
		this.no_of_impression = no_of_impression;
	}
	
	
     void display() {
		System.out.println("Username: " + this.username);
		System.out.println("Email: " + this.email);
		System.out.println("Public: " + this.is_public);
		System.out.println("Verified: " + this.is_verified);
		System.out.println("Country: " + this.country_origin);
		System.out.println("Posts: " + this.no_of_post);
		System.out.println("Likes: " + this.like);
		System.out.println("Comments: " + this.comments);
		System.out.println("Created Year: " + this.created_at);
		System.out.println("Impressions: " + this.no_of_impression);
	}
	
 }// clas SocialMediaAcc end here

class IstagramAcc extends SocialMediaAcc
{
	int no_of_followers;
	int no_of_following;
	int hightlights;
	int no_of_post_artchieved;
	int no_of_audio_saved;
	
	 IstagramAcc() {
	super();
	System.out.println("\ndefault constructor");
	
	}// default

	IstagramAcc(String username, String email, String is_public, String is_verified, String country_origin,
			int no_of_post, int like, int comments, int created_at, int no_of_impression , int no_of_followers, int no_of_following, int hightlights, int no_of_post_artchieved,
			int no_of_audio_saved) 
	 {
		super(username, email, is_public, is_verified, country_origin,
			      no_of_post, like, comments, created_at, no_of_impression);
		System.out.println("\nparameterized constructor");
		this.no_of_followers = no_of_followers;
		this.no_of_following = no_of_following;
		this.hightlights = hightlights;
		this.no_of_post_artchieved = no_of_post_artchieved;
		this.no_of_audio_saved = no_of_audio_saved;
	}// parameterized

	 int getNo_of_followers() {
		return no_of_followers;
	}

	 void setNo_of_followers(int no_of_followers) {
		this.no_of_followers = no_of_followers;
	}

	 int getNo_of_following() {
		return no_of_following;
	}

	 void setNo_of_following(int no_of_following) {
		this.no_of_following = no_of_following;
	}

	 int getHightlights() {
		return hightlights;
	}

	 void setHightlights(int hightlights) {
		this.hightlights = hightlights;
	}

	 int getNo_of_post_artchieved() {
		return no_of_post_artchieved;
	}

	 void setNo_of_post_artchieved(int no_of_post_artchieved) {
		this.no_of_post_artchieved = no_of_post_artchieved;
	}

	 int getNo_of_audio_saved() {
		return no_of_audio_saved;
	}

	 void setNo_of_audio_saved(int no_of_audio_saved) {
		this.no_of_audio_saved = no_of_audio_saved;
	}
	void display()
	{
		super.display();
		System.out.println("follwers is" + this.no_of_followers);
		System.out.println("follwing is" + this.no_of_following);
		System.out.println("hightlight is" + this.hightlights);
		System.out.println("psot archieved is" + this.no_of_post_artchieved);
		System.out.println("audio_saved is" + this.no_of_audio_saved);
	
	}

	
}// class instagram end here
class LikedIn extends SocialMediaAcc
{

	int no_of_connection;
	int no_of_profileview;
	int no_of_jobs_applied;
	
	 LikedIn() {
		super();
		System.out.println("\ndefault constructor");
		
	}// default

	 LikedIn(String username, String email, String is_public, String is_verified, String country_origin,
			int no_of_post, int like, int comments, int created_at, int no_of_impression , int no_of_connection, int no_of_profileview, int no_of_jobs_applied) {
		 super(username, email, is_public, is_verified, country_origin,
			      no_of_post, like, comments, created_at, no_of_impression);
		 System.out.println("\nparameterized constructor");
		this.no_of_connection = no_of_connection;
		this.no_of_profileview = no_of_profileview;
		this.no_of_jobs_applied = no_of_jobs_applied;
	}// parameterized

	 int getNo_of_connection() {
		return no_of_connection;
	}

	 void setNo_of_connection(int no_of_connection) {
		this.no_of_connection = no_of_connection;
	}

	 int getNo_of_profileview() {
		return no_of_profileview;
	}

	 void setNo_of_profileview(int no_of_profileview) {
		this.no_of_profileview = no_of_profileview;
	}

	 int getNo_of_jobs_applied() {
		return no_of_jobs_applied;
	}

     void setNo_of_jobs_applied(int no_of_jobs_applied) {
		this.no_of_jobs_applied = no_of_jobs_applied;
	}
	void display()
	{
		super.display();
		System.out.println("connection is" + this.no_of_connection);
		System.out.println("profileview is" + this.no_of_profileview);
		System.out.println("job applied is" + this.no_of_jobs_applied);
	}

}// class likein end here

class youtube extends SocialMediaAcc
{
	int no_of_subcribers;
	int waching_time;
	int is_monetized;
	int estimated_revenue;
	
	 youtube() {
	super();
	System.out.println("\ndefault constructor");
	}// default

	 youtube(String username, String email, String is_public, String is_verified, String country_origin,
			int no_of_post, int like, int comments, int created_at, int no_of_impression , int no_of_subcribers, int waching_time, int is_monetized, int estimated_revenue) {
		 super(username, email, is_public, is_verified, country_origin,
			      no_of_post, like, comments, created_at, no_of_impression);
		 System.out.println("\nparameterized constructor");
		this.no_of_subcribers = no_of_subcribers;
		this.waching_time = waching_time;
		this.is_monetized = is_monetized;
		this.estimated_revenue = estimated_revenue;
	}// parameterized

	int getNo_of_subcribers() {
		return no_of_subcribers;
	}

	 void setNo_of_subcribers(int no_of_subcribers) {
		this.no_of_subcribers = no_of_subcribers;
	}

	int getWaching_time() {
		return waching_time;
	}

	void setWaching_time(int waching_time) {
		this.waching_time = waching_time;
	}

	int getIs_monetized() {
		return is_monetized;
	}

	void setIs_monetized(int is_monetized) {
		this.is_monetized = is_monetized;
	}

	 int getEstimated_revenue() {
		return estimated_revenue;
	}

	 void setEstimated_revenue(int estimated_revenue) {
		this.estimated_revenue = estimated_revenue;
	}
	
	void display()
	{
		super.display();
		System.out.println("subcribers" + this.no_of_subcribers);
		System.out.println("waching time is" + this.waching_time);
		System.out.println("monetized is" + this.is_monetized);
		System.out.println("estimated renenve is" + this.estimated_revenue);
	}
	
	
}// class youtuble end here
class DemoSocialMediaAcc
{
	public static void main(String[] args) {
		
		SocialMediaAcc d1= new SocialMediaAcc();
		d1.display();
		
		SocialMediaAcc d2= new SocialMediaAcc("john_doe", "john@example.com", "yes", "yes", "USA", 120, 1500, 300, 2020, 50000);
		d2.display();
		
		IstagramAcc i1 = new IstagramAcc();
		i1.display();
		
		IstagramAcc i2 = new IstagramAcc("jane_insta", "jane@insta.com", "yes", "yes", "UK", 250, 5000, 800, 2019, 120000, 15000, 300, 20, 50, 10);
		i2.display();
		
		LikedIn L1 = new LikedIn();
		L1.display();
		
		LikedIn L2 = new LikedIn("alex_li", "alex@linkedin.com", "yes", "yes", "Canada", 50, 200, 30, 2018, 5000, 500, 2000, 10);
		L2.display();
		
		youtube y1 =new youtube();
		y1.display();
		
		youtube y2 =new youtube("tech_channel", "tech@youtube.com", "yes", "yes", "India", 120, 50000, 2000, 2017, 1000000, 100000, 5000, 1, 25000);
		y2.display();
	}
}

