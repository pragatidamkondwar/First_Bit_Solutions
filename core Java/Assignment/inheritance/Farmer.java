class Farmer {
 int Farmerid;
 String FarmerName;
 double landArea;
 String city;
 int annualIncome;
 int noofequipment;
 int insuamount;
 
 Farmer() {
	 System.out.println("\ndefault constructor");
}// default

 Farmer(int farmerid, String farmerName, double landArea, String city, int annualIncome, int noofequipment,
	int insuamount) {
	 System.out.println("\nparameterized constructor");
	Farmerid = farmerid;
	FarmerName = farmerName;
	this.landArea = landArea;
	this.city = city;
	this.annualIncome = annualIncome;
	this.noofequipment = noofequipment;
	this.insuamount = insuamount;
}//parameterized

int getFarmerid() {
	return Farmerid;
}

 void setFarmerid(int farmerid) {
	Farmerid = farmerid;
}

 String getFarmerName() {
	return FarmerName;
}

 void setFarmerName(String farmerName) {
	FarmerName = farmerName;
}

 double getLandArea() {
	return landArea;
}

 void setLandArea(double landArea) {
	this.landArea = landArea;
}

 String getCity() {
	return city;
}

 void setCity(String city) {
	this.city = city;
}

 int getAnnualIncome() {
	return annualIncome;
}

 void setAnnualIncome(int annualIncome) {
	this.annualIncome = annualIncome;
}

 int getNoofequipment() {
	return noofequipment;
}

 void setNoofequipment(int noofequipment) {
	this.noofequipment = noofequipment;
}

 int getInsuamount() {
	return insuamount;
}

 void setInsuamount(int insuamount) {
	this.insuamount = insuamount;
}
 
void display() {
	System.out.println("farmerid is" + this.Farmerid);
	System.out.println("famername is" + this.FarmerName);
	System.out.println("landArea is" + this.landArea);
	System.out.println("city is" + this.city);
	System.out.println("annualIncome is" + this.annualIncome);
	System.out.println("noofequipment is" + this.noofequipment);
	System.out.println("insuamount is" + this.insuamount);
	
 }
}// farmer end here

class DairyFarmer extends Farmer
{
 int noofcattles;
 int milkproducedperday;
 int dairylineno;

  DairyFarmer() {
	  super();
	 System.out.println("\ndefault constructor");
}//default

 DairyFarmer(int farmerid, String farmerName, double landArea, String city, int annualIncome, int noofequipment,
			int insuamount,int noofcattles, int milkproducedperday, int dairylineno) {
	super(farmerid, farmerName, landArea,  city, annualIncome, noofequipment,
			 insuamount);
	System.out.println("\nparameterized constructor");
	this.noofcattles = noofcattles;
	this.milkproducedperday = milkproducedperday;
	this.dairylineno = dairylineno;
}//parameterized

 int getNoofcattles() {
	return noofcattles;
}

 void setNoofcattles(int noofcattles) {
	this.noofcattles = noofcattles;
}

 int getMilkproducedperday() {
	return milkproducedperday;
}

 void setMilkproducedperday(int milkproducedperday) {
	this.milkproducedperday = milkproducedperday;
}

 int getDairylineno() {
	return dairylineno;
}

 void setDairylineno(int dairylineno) {
	this.dairylineno = dairylineno;
}

void display() {
	super.display();
	System.out.println("farmerid is" + this.noofcattles);
	System.out.println("farmerid is" + this.milkproducedperday);
	System.out.println("farmerid is" + this.dairylineno);
}
}//DairyFarmer end here

class PoutryFarmer extends Farmer
{
	int noofchicken;
	String poutryFarmerName;
	
	 PoutryFarmer() {
		 System.out.println("\ndefault constructor");
	}// default 
	 
	 PoutryFarmer(int farmerid, String farmerName, double landArea, String city, int annualIncome, int noofequipment,
				int insuamount,int noofchicken, String poutryFarmerName) {
		 super(farmerid, farmerName, landArea,  city, annualIncome, noofequipment,
				 insuamount);
		System.out.println("\nparameterized constructor");
		this.noofchicken = noofchicken;
		this.poutryFarmerName = poutryFarmerName;
	}//parameterized 
	 
	 int getNoofchicken() {
		return noofchicken;
	}
	 void setNoofchicken(int noofchicken) {
		this.noofchicken = noofchicken;
	}
	 String getPoutryFarmerName() {
		return poutryFarmerName;
	}
	 void setPoutryFarmerName(String poutryFarmerName) {
		this.poutryFarmerName = poutryFarmerName;
	}
	
	void display() {
		super.display();
		System.out.println("farmerid is" + this.noofchicken);
		System.out.println("farmerid is" + this.poutryFarmerName);
 }
}// PoutryFarmer end here
class organicFarmer extends Farmer
{
	int organicid;
	String fertilizedused;
	
	 organicFarmer() {
		 System.out.println("\ndefault constructor");
	}// default
	 
	 organicFarmer(int farmerid, String farmerName, double landArea, String city, int annualIncome, int noofequipment,
				int insuamount,int organicid, String fertilizedused) {
		 super(farmerid, farmerName, landArea,  city, annualIncome, noofequipment,
				 insuamount);
		System.out.println("\nparameterized constructor");
		this.organicid = organicid;
		this.fertilizedused = fertilizedused;
	}// parameterized
	
	 int getOrganicid() {
		return organicid;
	}
	 void setOrganicid(int organicid) {
		this.organicid = organicid;
	}
	 String getFertilizedused() {
		return fertilizedused;
	}
	 void setFertilizedused(String fertilizedused) {
		this.fertilizedused = fertilizedused;
	}
	void display() {
		super.display();
		System.out.println("farmerid is" + this.organicid);
		System.out.println("farmerid is" + this.fertilizedused);
 }
}//organicFarmer end here
class DemoFarmer 
{
	public static void main(String[] args) {
		
	Farmer f1=new Farmer();
	f1.display();
	
	Farmer f2=new Farmer(101, "Ramesh Patil", 12.5, "Nagpur", 250000, 8, 50000);
	f2.display();
	
	DairyFarmer d1=new DairyFarmer();
	d1.display();
	
	DairyFarmer d2=new DairyFarmer(102, "Suresh Pawar", 8.2, "Pune", 300000, 5, 60000, 25, 180, 3);
	d2.display();
	
	PoutryFarmer p1=new PoutryFarmer();
	p1.display();
	
	PoutryFarmer p2=new PoutryFarmer(103, "Ramesh Shinde", 6.5, "Nashik", 250000, 4, 45000, 500, "Golden Eggs Poultry Farm");
	p2.display();
	
	organicFarmer o1=new organicFarmer();
	o1.display();
	
	organicFarmer o2=new organicFarmer(104, "Vijay Patil", 9.3, "Kolhapur", 280000, 6, 55000, 201, "Vermicompost");
	o2.display();
	}
	
}