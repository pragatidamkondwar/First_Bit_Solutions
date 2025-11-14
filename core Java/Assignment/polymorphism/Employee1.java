package ploy;

class Employee1 {

		int id;
		String name;
	  	double salary;
	  	
	  	Employee1()//default constructor
		{
		System.out.println("Constructor called");
		this.id=45;
		this.name="xyz";
		this.salary=4567;
		}
	  	Employee1(int id,String name,double salary)//parameterized   constructor
		{
		System.out.println("\nparameterized  Constructor called");
		this.id=id;
		this.name=name;
		this.salary=salary;
		}
	  	
		int getId() {
			return id;
		}
		void setId(int id) {
			this.id = id;
		}
		String getName() {
			return name;
		}
		void setName(String name) {
			this.name = name;
		}
		double getSalary() {
			return salary;
		}
		void setSalary(double salary) {
			this.salary = salary;
		}
		
		double calsal()
		{
			return salary;
		}// calsal
		
		void display()
		{
		System.out.println("ID is::"+this.id);
		System.out.println("Name is::"+this.name);
		System.out.println("Salary is::"+this.salary);
		}
	}//employee class ends here
	class Admin extends Employee1
	{
		double allowance;
		
		Admin()//default constructor
		{
		super();
		System.out.println("Constructor called");
		allowance=2300;
		}
		
		Admin(int id,String name,double salary,double allowance)//parameterized   constructor
		{
		super(id, name, salary);
		System.out.println("\nparameterized  Constructor called");
		this.allowance=allowance;
		}
		
	double getAllowance() {
			return allowance;
		}
		 void setAllowance(double allowance) {
			this.allowance = allowance;
		}
		
		double calsal()
		{
			return salary+allowance;
		}//calsal
		
		
		void display()
		{
		super.display();
		System.out.println("allowance is::"+this.allowance);
		System.out.println("calculatesalsalary:"+calsal());
		
		}
	}
	class HR extends Employee1
	{
	 	double commission;
	 	
		HR()//default constructor
		{
			super();
		System.out.println("Constructor called");
	 	this.commission=4000;
		}
		
		HR(int id,String name,double salary,double commission)//parameterized  constructor
		{
			super(id, name, salary);
			System.out.println("\nparameterized Constructor called");
	 	this.commission=commission;
		}
		
	     double getCommission() {
			return commission;
		}

		void setCommission(double commission) {
			this.commission = commission;
		}
		
		double calsal()
		{
			return salary+commission;
		}//calsal
		
		void display()
		{
		super.display();
		System.out.println("commission is::"+this.commission);
		System.out.println("commission is::"+calsal());
		System.out.println("calculatesalsalary:"+calsal());
		}
	}//HR class ends here

	class SalesManager extends Employee1
	{
	 	double incentive;
		double target;
		
		SalesManager()//default constructor
		{
		super();
		System.out.println("Constructor called");
		this.incentive=40099;
		this.target=3400;
		
		}
		
		SalesManager(int id,String name,double salary,double incentive,double target)//default constructor
		{
		super(id, name, salary);
		System.out.println("\nparameterized Constructor called");
		this.incentive=incentive;
		this.target=target;
		}
		
		double getIncentive() {
			return incentive;
		}

		 void setIncentive(double incentive) {
			this.incentive = incentive;
		}

		 double getTarget() {
			return target;
		}

		 void setTarget(double target) {
			this.target = target;
		}
		 
		 double calsal()
			{
				return salary+incentive;
			}//calsal
			

		void display()
		{
		super.display();
		System.out.println("incentive is::"+this.incentive);
		System.out.println("target is::"+this.target);
		System.out.println("calculatesalsalary:"+calsal());
		}
		
	class AreaSalesManager extends SalesManager
		{
			String AreaName;
			
			 AreaSalesManager() {
				super();//super(id, name, salary,incentive,target);
				this.AreaName="karvenager";
			}// d

			 
			public AreaSalesManager(int id,String name,double salary , double incentive , double target ,String areaName) {
				super(id, name, salary,incentive,target);
				AreaName = areaName;
			}// d

			public String getAreaName() {
				return AreaName;
			}

			public void setAreaName(String areaName) {
				AreaName = areaName;
			}
			void display()
			{
			super.display();
			System.out.println("incentive is::"+this.AreaName);
		}
	}
	class DemoEmployee1
	{
		public static void main(String[] args) {
			
			
			Employee1 e1;
			e1 = new Employee1(1,"pragati",5000);
			e1.display();
			//e1.calsal();
			System.out.println("calculatesalsalary:"+e1.calsal());
			
			
			e1= new Admin(2,"shruti",3000,500);
			e1.display();
			System.out.println("calculatesalsalary:"+e1.calsal());
			
			e1=new HR(3,"neha",54000,800);
			e1.display();
			System.out.println("calculatesalsalary:"+e1.calsal());
			
			e1=new SalesManager(4,"avani",60000,600,800);
			e1.display();
			System.out.println("calculatesalsalary:"+e1.calsal());

		}
	 }
	}

