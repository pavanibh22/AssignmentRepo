class Employee
{
	 int salary,age;
 	 String name,designation;
	
    
       Employee(String name,int age,int salary,String designation)
	{
		this.name=name;
 		this.age=age;
 		this.salary=salary;
 		this.designation=designation;
	}

      public void raiseSalary(int incAmount)
	{
 	salary=salary+incAmount;
 	System.out.println(salary);
	}
   
	public void display()
	{
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Salary :"+salary);
	System.out.println("Designation :"+designation);
	}
}
public class EmployeeMain
{
	public static void main(String args[])
	{
	 Employee e1=new Employee("Ravi",25,30000,"Tester");
	 Employee e2=new Employee("Sujatha",35,50000,"Programmer");
 	 Employee e3=new Employee("Prabhakar",45,90000,"Manager");
	  e1.display();
        System.out.println(" ");
	  e2.display();
        System.out.println(" ");
	  e3.display();
        System.out.println(" ");
	  e1.raiseSalary(-5000);
	  e2.raiseSalary(7000);
        e3.raiseSalary(0);
        System.out.println("-----After-----");
	  e1.display();
        System.out.println(" ");
	  e2.display();
        System.out.println(" ");
        e3.display();
	}
}


