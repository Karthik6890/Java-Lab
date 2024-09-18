import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);	
	}
}
class Employee extends Person{
	int salary;
	Employee(String name,int age,int salary){
		super(name,age);
		this.salary=salary;
	}
	void display(){
		super.display();
		System.out.println("Salary="+this.salary);
	}
} 
class single_inheritence_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();		
		Person p1=new Person(name,age);
		p1.display();		
		System.out.println("Enter Salary:");
		int salary=sc.nextInt();
		Employee e1=new Employee(name,age,salary);
		e1.display();
		sc.close();
	}
}
