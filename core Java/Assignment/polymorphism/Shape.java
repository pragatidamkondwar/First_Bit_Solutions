package ploy;

	public class Shape {

		    String color;
		    double borderWidth;
		    String shapeName;
		    double area;
	        
		    Shape()//default
		    {
		    	super();
		    	System.out.println("shape default constructor");
		    	color="default";
		    	borderWidth=4.5;
		    	shapeName="not entered";
		    }
		    Shape(String shapeName, String color, double borderWidth , double area) //parameterized 
		    {
		    	 System.out.println("shape parameterized constructor");
		        this.shapeName = shapeName;
		        this.color = color;
		        this.borderWidth = borderWidth;
		        this.area=area;
		    }

		     String getColor() {
				return color;
			}

			 void setColor(String color) {
				this.color = color;
			}

			 double getBorderWidth() {
				return borderWidth;
			}

			 void setBorderWidth(double borderWidth) {
				this.borderWidth = borderWidth;
			}

			 String getShapeName() {
				return shapeName;
			}

		     void setShapeName(String shapeName) {
				this.shapeName = shapeName;
			}
		     
		     double getarea() {
					return area;
				}

			public void setArea(double area) {
				this.area = area;
			}
			double calarea()
				{
					return area;
				}
			 
			 void display() {
			        System.out.println("Shape: " + shapeName);
			        System.out.println("Color: " + color);
			        System.out.println("Border Width: " + borderWidth);
			        System.out.println("area :"+area);
			
		}//shape class ends here
	}
		class Rectangle extends Shape {
		    double length;
		    double breadth;
		    Rectangle()//default
		    {
		    	super();
		    	System.out.println("reclangle default constructor");
		    	length=5.6;
		    	breadth=4.5;
		    	
		    }
		    Rectangle(String shapeName, String color, double borderWidth , double area, double length, double breadth) {
		        super( shapeName,color, borderWidth ,area);
		        System.out.println("reclangle parameterized constructor");
		        this.length = length;
		        this.breadth = breadth;
		    }

		    double area() {
		        return length * breadth;
		    }

		    double getLength() {
				return length;
			}
			 void setLength(double length) {
				this.length = length;
			}
			double getBreadth() {
				return breadth;
			}
			void setBreadth(double breadth) {
				this.breadth = breadth;
			}
			
			
			double  calarea()
		    {
		    	return length*breadth;
		    }
			
			void display() {
		        super.display();
		        System.out.println("Length: " + length);
		        System.out.println("Breadth: " + breadth);
		        System.out.println("calarea: " + calarea());
		    }
		
		}//rectangle class ends here
		class Circle extends Shape {
		    double radius;
		    
		    Circle() 
		    {
		    	super();
		    	System.out.println("circle default constructor");
		    	radius=4.5;
		    	
		    }
		    Circle(String shapeName, String color, double borderWidth , double area, double radius)//parameterized
		    {
		    	 super( shapeName,color, borderWidth ,area);
		        System.out.println("circle parameterized constructor");
		        this.radius = radius;
		    }

		     double getRadius() {
				return radius;
			}
			 void setRadius(double radius) {
				this.radius = radius;
			}
			
			double  calarea()
		    {
		    	return (3.14*(radius*radius));
		    }
			
		    void display() {
		        super.display();
		        System.out.println("Radius: " + radius);
		        System.out.println("calarea: " + calarea());
		    }
		}//circle class ends here
		class Triangle extends Shape {
		    double base;
		    double height;
		    Triangle()//default
		    {
		    	super();
		    	System.out.println("triangle default constructor");
		    	base=4.3;
		    	height=6.5;
		    }
		    Triangle(String shapeName, String color, double borderWidth , double area, double base, double height)//parameterized
		    {
		   	   super( shapeName,color, borderWidth ,area);	
		        System.out.println("triangle parameterized constructor");
		        this.base = base;
		        this.height = height;
		    }

		     double getBase() {
				return base;
			}
			void setBase(double base) {
				this.base = base;
			}
			double getHeight() {
				return height;
			}
			void setHeight(double height) {
				this.height = height;
			}
			
			double calarea()
			{
				return (0.5*base*height);
			}
		 
		    void display() {
		        super.display();
		        System.out.println("Base: " + base);
		        System.out.println("Height: " + height);
		        System.out.println("calarea: " + calarea());
		    }
		}//triangle class ends here

		class DemoShape {
		    public static void main(String[] args) {
		    	Shape s ;
		    	s = new Shape("square", "Red", 2.5, 154.6);
		    	s.display();
		    	s.calarea();
		    	
		        System.out.println("--- Rectangle ---");
		        s= new Rectangle("Rectangle", "Blue", 1.5, 300.0, 20.0, 15.0);
		        s.display();
		        s.calarea();
		        
		        System.out.println("\n--- Circle ---");
		        s= new Circle("Circle", "pink", 2.0, 314.16, 10.0);
		        s.display();
		        s.calarea();

		        System.out.println("\n--- Triangle ---");
		        s = new Triangle("Triangle", "Green", 1.5, 75.0, 10.0, 15.0);
		        s.display();
		        s.calarea();
		        
		    }//main ends here
		}//demo class ends here


