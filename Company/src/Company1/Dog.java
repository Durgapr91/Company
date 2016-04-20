package Company1;

public class Dog {
	
	 int age=7;
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog()
	{
		this.age=1;
	}
	public Dog(int age)
	{
		
		this.age=age;
		System.out.println(age);
		
	}
	
	public static void main(String []args)
	{
		Dog t=new Dog(8);
		Dog t1=new Dog();
		System.out.println(t.getAge());
		System.out.println(t1.getAge());
		System.out.println("hi");
		
	}
}