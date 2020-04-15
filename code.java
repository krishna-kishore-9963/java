abstract class Vehical
{
double price;
double mileage;
	int fuel;
	public Vehical(double p, double m, int f)
	{
		price = p;
		mileage = m;
		fuel = f;
	}
	public int getFuel()
	{
		return fuel;
	}
	abstract public void addFuel(int f);
}
class Car extends Vehical
{
	String car_name = "Nexa Ciaz";
	public Car(double p, double m, int f)
	{
		super(p,m,f);
	}
	public void addFuel(int f)
	{
		fuel= fuel + f;
	}
	public int getFuel()
	{
		System.out.println("Name of the car : "+car_name);
		return fuel;
	}
}

class Inheritance
{
	public static void main(String[] args)
	{
		int fuel1;
		Car obj = new Car(100000,17.2,20);
		obj.addFuel(5);
		fuel1 = obj.getFuel();
System.out.println("The fuel in the car is : "+fuel1);
		
	}
}
