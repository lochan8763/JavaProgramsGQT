package inheritance;
class Car
{
	
	void start()
	{
		System.out.println("the car is started");
		
	}
	void speed()
	{
		System.out.println("speed");
	}
	void stop()
	{
		System.out.println("the car is stopped");
	}
}
	
	class ferrari extends Car
	{
		@Override
		void speed() {
			System.out.println("car is at top speed");
		}
		
	}
	class Innova extends Car
	{
		@Override
		void speed() {
			System.out.println("car is at good speed");
		}
		
	}
	class PremierPadmini extends Car
	{
		@Override
		void speed() {
			System.out.println("car is at low speed");
		}
		
	}
public class inheritanceDemo {

	public static void main(String[] args) {
		ferrari f = new ferrari();
		f.start();
		f.speed();
		f.stop();
	}

}
