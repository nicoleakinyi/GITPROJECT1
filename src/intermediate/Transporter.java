package intermediate;

public class Transporter {

	protected String make,model,colour,bodytype;
	protected int engineCC,id,passengers,speed,topspeed;
	
	
	public void accelerate()
	{
		if(	speed == topspeed)
		{	speed=topspeed;
		}
		else {speed++;}
		}
	public void decelerate()
	{
		if(	speed == 0)
		{	speed=0;
		}
		else {speed--;}

	}
}

	
