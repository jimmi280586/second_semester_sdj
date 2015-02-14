//import lejos.nxt.LightSensor;
//import lejos.nxt.MotorPort;



public class Movement 
{
	//private LightSensor light;
	
	public Movement()
	{
		
	}
	
	public void forwardWithLights(int a)
	{	
		if(a == 1)
		{
		//  MotorPort.A.controlMotor(100, 1);
		//  MotorPort.B.controlMotor(100, 1);
		  LightOn();
		}
		if (a == 2)
		{
		//	  MotorPort.A.controlMotor(100, 3);
		//	  MotorPort.B.controlMotor(100, 3);
			  LightOff();
		}
	}
	
	public void LightOn()
	{
		//light.setFloodlight(true);
	}
	
	public void LightOff()
	{
		//light.setFloodlight(false);
	}
	
	public void backwardWithLights(int a)
	{
		if(a == 1)
		{
		//  MotorPort.A.controlMotor(100, 2);
		//  MotorPort.B.controlMotor(100, 2);
		  LightOn();
		}
		if (a == 2)
		{
		//	  MotorPort.A.controlMotor(100, 3);
		//	  MotorPort.B.controlMotor(100, 3);
			  LightOff();
		}
	}
}
