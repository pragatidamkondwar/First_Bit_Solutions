
 class Defence {
	 String Name;
	 int notroop;
	 int novehicle;
	 int nooffb;
	 int nomission;
	 int ca;
	 String CountryName;
	 static int mappowercount=0;

	 
	 Defence() {
		 System.out.println("default constructor called");
			
	}// default


 Defence(String name, int notroop, int novehicle, int nooffb, int nomission, int ca, String countryName) {
	 
		System.out.println("\nparameterized constructor");
		Name = name;
		this.notroop = notroop;
		this.novehicle = novehicle;
		this.nooffb = nooffb;
		this.nomission = nomission;
		this.ca = ca;
		CountryName = countryName;
		mappowercount++;
	}// parameterized


       String getName() {
		return Name;
	}


	void setName(String name) {
		Name = name;
	}


	 int getNotroop() {
		return notroop;
	}


	 void setNotroop(int notroop) {
		this.notroop = notroop;
	}


	 int getNovehicle() {
		return novehicle;
	}


	 void setNovehicle(int novehicle) {
		this.novehicle = novehicle;
	}


      int getNooffb() {
		return nooffb;
	}


     void setNooffb(int nooffb) {
		this.nooffb = nooffb;
	}


	 int getNomission() {
		return nomission;
	}


	 void setNomission(int nomission) {
		this.nomission = nomission;
	}


	int getCa() {
		return ca;
	}


	 void setCa(int ca) {
		this.ca = ca;
	}


	String getCountryName() {
		return CountryName;
	}


	 void setCountryName(String countryName) {
		CountryName = countryName;
	}


	 static int getMappowercount() {
		return mappowercount;
	}
	 
	 static void setMappowercount(int mappowercount) {
		Defence.mappowercount = mappowercount;
	}
	
	 void display() {
			System.out.println("name is" + this.Name);
			System.out.println("no of troops is" + this.notroop);
			System.out.println("no of vehicle is" + this.novehicle);
			System.out.println("no of fbass is" + this.nooffb);
			System.out.println("no of mission is" + this.nomission);
			System.out.println("no of casulaty is" + this.ca);
			System.out.println("no of country name is" + this.CountryName);		
		}
}// class defence end here
 class Army extends Defence
 {
	 int nooftunts;
	 int noofguns;
	 int noofgradas;
	 int noofbataliun;
	 
	    Army() {
		super();
		System.out.println("\ndefault constructor");
	    }// default

		Army(String name , int nooftroop, int novehicle, int nooffb,int nomission,int ca , String CountryName,int nooftunts, int noofguns, int noofgradas, int noofbataliun) {
			super(name,nooftroop,novehicle,nomission,ca,noofbataliun, CountryName);
			System.out.println("\nparameterized constructor");
			this.nooftunts = nooftunts;
			this.noofguns = noofguns;
			this.noofgradas = noofgradas;
			this.noofbataliun = noofbataliun;
		}// parameterized
	
		 int getNooftunts() {
			return nooftunts;
		}

		 void setNooftunts(int nooftunts) {
			this.nooftunts = nooftunts;
		}

		 int getNoofguns() {
			return noofguns;
		}

		 void setNoofguns(int noofguns) {
			this.noofguns = noofguns;
		}

		 int getNoofgradas() {
			return noofgradas;
		}

		 void setNoofgradas(int noofgradas) {
			this.noofgradas = noofgradas;
		}

		 int getNoofbataliun() {
			return noofbataliun;
		}

		 void setNoofbataliun(int noofbataliun) {
			this.noofbataliun = noofbataliun;
		}
		
		 void display() {
			 super.display();
				System.out.println("no of tunts is" + this.nooftunts);		
				System.out.println("no of guns is" + this.noofguns);	
				System.out.println("no of gradas is" + this.noofgradas);
				System.out.println("no of batalium is" + this.noofbataliun);
		}
 }
 class Navy extends Defence
 {
	 
	int noofShipd;
	 int noofsubmmaries;
	 
	 
	  Navy() {
		super();
		System.out.println("\ndefault constructor");
	}// default


       Navy( String name , int nooftroop, int novehicle, int nooffb,int nomission,int ca , String CountryName, int noofShipd, int noofsubmmaries) 
       {
    	   super(name, nooftroop, novehicle, nooffb, nomission , ca, CountryName);
		System.out.println("\nparameterized constructor");
		this.noofShipd = noofShipd;
		this.noofsubmmaries = noofsubmmaries;
	}// parameterized


	 int getNoofShipd() {
		return noofShipd;
	}


	 void setNoofShipd(int noofShipd) {
		this.noofShipd = noofShipd;
	}


	 int getNoofsubmmaries() {
		return noofsubmmaries;
	}


	 void setNoofsubmmaries(int noofsubmmaries) {
		this.noofsubmmaries = noofsubmmaries;
	}
       
       void display()
       {
    	   super.display();
    	   System.out.println("noofship is" + this.noofShipd);
    	   System.out.println("noofsubmmaries is" + this.noofsubmmaries);   
       }
       
 }
 class Air extends Defence
 {
	 int noofcraft;
	 int noofmissalies;
	 
	 
	  Air() {
		super();
		System.out.println("\ndefault constructor");
	}// default


	 Air(String name , int nooftroop, int novehicle, int nooffb,int nomission,int ca , String CountryName,int noofcraft, int noofmissalies) {
		 super(name, nooftroop, novehicle, nooffb, nomission, ca, CountryName);
		System.out.println("\nparameterized constructor");
		this.noofcraft = noofcraft;
		this.noofmissalies = noofmissalies;
	}


	int getNoofcraft() {
		return noofcraft;
	}


	 void setNoofcraft(int noofcraft) {
		this.noofcraft = noofcraft;
	}


	 int getNoofmissalies() {
		return noofmissalies;
	}


	 void setNoofmissalies(int noofmissalies) {
		this.noofmissalies = noofmissalies;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("noofship is" + this.noofcraft);
		 System.out.println("noofship is" + this.noofmissalies);
	 }
 }// Air end here
 class Demodefence
 {
	 public static void main(String[] args) {
		
		 Defence d1= new Defence();
		 d1.display();
		 
		 Defence d2= new Defence("Indian Army", 1200000, 50000, 20000, 120, 15, "India");
		 d2.display();
		 
		 Army a1 = new Army ();
		 a1.display();
		 
		 Army a2 = new Army ( "Indian Army", 1200000, 50000, 20000, 120, 15, "India",
		            5000, 20000, 15000, 40);
		 a2.display();
		 
		 Navy n1 =new Navy();
		 n1.display();
		 
		 Navy n2 =new Navy( "Indian Navy", 70000, 1500, 5000, 85, 10, "India",
		            150, 20);
		 n2.display();
		 
		 Air r1= new Air();
		 r1.display();
		 
		 Air r2= new Air(  "Indian Air Force", 150000, 3000, 8000, 95, 12, "India",
		            1500, 400);
		 r2.display();
	}
 }
 
		
 
