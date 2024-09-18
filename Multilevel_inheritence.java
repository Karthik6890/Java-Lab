class Animal{
	void makeSound(){
		System.out.println("Woof!");
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Woof!");
	}
}
class Puppy extends Dog{
	void makeSound(){
		System.out.println("Yap!");
	}
}
class Multilevel_inheritence{
	public static void main(String[] args){
		Animal a1=new Animal();
		Dog d1=new Dog();
		Puppy p1=new Puppy();
		a1.makeSound();
		d1.makeSound();
		p1.makeSound();		
	}
}
