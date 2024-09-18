class Vehicle{
	void start( ){
		System.out.println("Vehicle Started");
	}
}
class Car extends Vehicle{
	void start(){
		System.out.println("Car Started");
	}
}
class single_inheritence{
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		Car c1=new Car();
		v1.start();
		c1.start();
	}
}
