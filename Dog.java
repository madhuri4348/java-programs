class Animal
{
	String name;
	char gender;
	String color;
	void eat()
	{
		System.out.println("x:3times per day");
	}
	void sleep()
	{
		System.out.println("x:6hours per day");
	}
	void bark()
	{
		System.out.println("x:3times per day");
	}
}
class Dog extends Animal {
	public static void main(String args[])
	{
		Dog obj=new Dog();
		obj.name="Dog";
		obj.gender='m';
		obj.color="Black";
		obj.eat();
		obj.sleep();
		obj.bark();
		System.out.println(obj.name);
		System.out.println(obj.gender);
		System.out.println(obj.color);
	}
}
