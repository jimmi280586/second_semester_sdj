package billys.car;

public class CarStopped1 extends CarState
{
	
	public void powerOn(Car car)
	{
		Car.setState(CARFORWARD);
		System.out.println("the car is stopped with the headlights off");
	}
}
