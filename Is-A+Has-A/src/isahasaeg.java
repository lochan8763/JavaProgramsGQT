class brain
{
	double iq;
	float weight;
	
	public brain(double iq, float weight) {
		super();
		this.iq = iq;
		this.weight = weight;
	}

	public double getIq() {
		return iq;
	}

	public float getWeight() {
		return weight;
	};
	
}

class heart
{
	float beat;
	float weight;
	
	public heart(float beat, float weight) {
		super();
		this.beat = beat;
		this.weight = weight;
	}

	public float getBeat() {
		return beat;
	}

	public float getWeight() {
		return weight;
	}
}

//aggregate
class book
{
	String name;
	String author;
	
	public book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}

class bike
{
	String name;
	float cost;
	
	public bike(String name, float cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public float getCost() {
		return cost;
	}
}

class Human
{
	brain b = new brain(2.1,100);
	heart h = new heart(90,150);
}

class student extends Human{
	void hasAbook(book b)
	{
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
	}
	
	void hasAbike(bike bk)
	{
		System.out.println(bk.getName());
		System.out.println(bk.getCost());
	}
}

public class isahasaeg {

	public static void main(String[] args) {
		
		student s = new student();
		book b = new book("xyz","ram");
		bike bk = new bike("abc",12000);
		
		System.out.println(s.b.getIq());
		System.out.println(s.b.getWeight());
		System.out.println(".........................");
		
		System.out.println(s.h.getBeat());
		System.out.println(s.h.getWeight());
		System.out.println(".........................");
		
		s.hasAbook(b);
		s.hasAbike(bk);
		System.out.println(".........................");
	
		s=null;
		
		//System.out.println(s.b.getIq());
		//System.out.println(s.b.getWeight());
		//System.out.println(s.h.getBeat());
		//System.out.println(s.h.getWeight());
		
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
	}

}
