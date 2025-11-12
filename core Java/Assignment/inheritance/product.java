 class product {
 int productid;
 String name;
 String brand;
 double price;
 String category;
 String manufacturedate;
 String originCountry;
 
  product() {
	System.out.println("\ndefault constructor");
}

 product(int productid, String name, String brand, double price, String category, String manufacturedate,
		String originCountry) {
	super();
	System.out.println("\nparameterized constructor");
	this.productid = productid;
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.category = category;
	this.manufacturedate = manufacturedate;
	this.originCountry = originCountry;
}

 int getProductid() {
	return productid;
}

 void setProductid(int productid) {
	this.productid = productid;
}

 String getName() {
	return name;
}

 void setName(String name) {
	this.name = name;
}

 String getBrand() {
	return brand;
}

 void setBrand(String brand) {
	this.brand = brand;
}
 double getPrice() {
	return price;
}

 void setPrice(double price) {
	this.price = price;
}

 String getCategory() {
	return category;
}
 void setCategory(String category) {
	this.category = category;
}

 String getManufacturedate() {
	return manufacturedate;
}

 void setManufacturedate(String manufacturedate) {
	this.manufacturedate = manufacturedate;
}

 String getOriginCountry() {
	return originCountry;
}

 void setOriginCountry(String originCountry) {
	this.originCountry = originCountry;
}

 void display()
 {
	 System.out.println("productid" + this.productid);
	 System.out.println("name" + this.name);
	 System.out.println("brand" + this.brand);
	 System.out.println("price" + this.price);
	 System.out.println("categary" + this.category);
	 System.out.println("manufacturedate" + this.manufacturedate);
	 System.out.println("origincountry" + this.originCountry);
	 
  }
}

 class Grocery extends product
 {
	 String expirydate;
	 String packingType;
	 String ingredients;
	 
	  Grocery() {
		super();
		System.out.println("\ndefault constructor");
	}

	 Grocery( int productid, String name, String brand, double price, String category, String manufacturedate,
			String originCountry, String expirydate, String packingType, String ingredients) 
	{
		super( productid,  name,  brand, price, category,  manufacturedate,
			  originCountry );
		System.out.println("\nparameterized constructor");
		this.expirydate = expirydate;
		this.packingType = packingType;
		this.ingredients = ingredients;
	}

	
	 String getExpirydate() {
		return expirydate;
	}

	 void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	 String getPackingType() {
		return packingType;
	}

	 void setPackingType(String packingType) {
		this.packingType = packingType;
	}

	 String getIngredients() {
		return ingredients;
	}

	void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	 void display()
	 {
		 super.display();
		 System.out.println("expirydate" + this.expirydate);
		 System.out.println("packingType" + this.packingType);
		 System.out.println("ingreadients" + this.ingredients);
	 }
 }
 class Electronics extends product
 {
	 
	 String modelno;
	 int Warranty_years;
	 String powerSourece;
	 String color;
	 double weight;
	
	 Electronics() {
		super();
		System.out.println("\ndefault constructor");
	}

 Electronics( int productid, String name, String brand, double price, String category, String manufacturedate,
			String originCountry,String modelno, int warranty_years, String powerSourece, String color, double weight) 
	{
		super( productid,  name,  brand, price, category,  manufacturedate,
				  originCountry );
		System.out.println("\nparameterized constructor");
		this.modelno = modelno;
		Warranty_years = warranty_years;
		this.powerSourece = powerSourece;
		this.color = color;
		this.weight = weight;
	}

	 String getModelno() {
		return modelno;
	}

	 void setModelno(String modelno) {
		this.modelno = modelno;
	}

	int getWarranty_years() {
		return Warranty_years;
	}

	 void setWarranty_years(int warranty_years) {
		Warranty_years = warranty_years;
	}

	 String getPowerSourece() {
		return powerSourece;
	}

	void setPowerSourece(String powerSourece) {
		this.powerSourece = powerSourece;
	}

	 String getColor() {
		return color;
	}

	 void setColor(String color) {
		this.color = color;
	}

	 double getWeight() {
		return weight;
	}

    void setWeight(double weight) {
		this.weight = weight;
	}
	 void display()
	 {
		 super.display();
		 System.out.println("model no" + this.modelno);
		 System.out.println("warranty" + this. Warranty_years);
		 System.out.println("powersource" + this. powerSourece);
		 System.out.println("color" + this. color);
		 System.out.println("weight" + this.weight );
		 
	 }
 }
 class Furniture extends product
 {
	String material;
	String dimensions;
	String type;
	String finishtype;
	String roomType;
	
	 Furniture() {
		super();
		System.out.println("\ndefault constructor");
	}

	 Furniture(int productid, String name, String brand, double price, String category, String manufacturedate,
			String originCountry,String material, String color, String dimensions, String type, String finishtype,
			String roomType) 
	{
		super( productid,  name,  brand, price, category,  manufacturedate,
				  originCountry );
		System.out.println("\nparameterized constructor");
		this.material = material;
		this.dimensions = dimensions;
		this.type = type;
		this.finishtype = finishtype;
		this.roomType = roomType;
	}

	 String getMaterial() {
		return material;
	}

	 void setMaterial(String material) {
		this.material = material;
	}

	 String getDimensions() {
		return dimensions;
	}

	 void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	 String getType() {
		return type;
	}

	 void setType(String type) {
		this.type = type;
	}

	 String getFinishtype() {
		return finishtype;
	}

	void setFinishtype(String finishtype) {
		this.finishtype = finishtype;
	}

	 String getRoomType() {
		return roomType;
	}

	 void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	void display()
	{
		super.display();
		System.out.println("material" + this.material);
		System.out.println("dimensions" + this.dimensions);
		System.out.println("type" + this. type);
		System.out.println("finishtype" + this. finishtype);
		System.out.println("roomtype" + this. roomType);
		 
		
	}
 }
 class Demoproduct 
 {
	 public static void main(String[] args) {
		
		 product p1= new product();
		 p1.display();
		 
		 
		 product p2= new product( 101, "Smartphone", "Samsung", 54999.99, "Electronics", "2025-01-10", "South Korea");
		 p2.display();
		 
		 Grocery g1 =new Grocery();
		 g1.display();
		 
		 Grocery g2 =new Grocery( 201, "Oats", "Quaker", 250.50, "Food", "2025-02-01",
		            "India", "2026-02-01", "Sealed Pouch", "Oats, Fiber, Vitamins");
		 g2.display();
		 
		 Electronics e1 = new Electronics();
		 e1.display();
		 
		 Electronics e2 = new Electronics(  301, "Laptop", "HP", 65999.99, "Electronics", "2025-01-10",
		            "China", "HP-250G9", 2, "Battery", "Silver", 1.5);
		 e2.display();
		 
		 Furniture f1 = new Furniture();
		 f1.display();
		 
		 Furniture f2 = new Furniture(401, "Dining Table", "Godrej", 18999.99, "Furniture", "2024-12-10",
		            "India", "Solid Wood", "Brown", "6x3 ft", "Table", "Matte Finish", "Dining Room");
		 f2.display();	
		 
	}
 }