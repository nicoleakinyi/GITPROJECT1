package intermediate;

public class CarWrong {
	private String make,model,colour,bodytype;
	private int engineCC,id,passengers,speed,topspeed;
	
	CarWrong(String make,int id,String model,String colour,String bodytype,int passengers,int speed,int topspeed,int engineCC){
		 
		this.make=make;
		this.id= id;
		this.model=model;
		this.colour=colour;
		this.bodytype=bodytype;
		this.engineCC=engineCC;
		this.passengers=passengers;
		this.speed=0;
		this.topspeed=topspeed;
		
	}
	
	CarWrong(){
		
	}
	
	public String getMake() {
		
		return make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBodytype() {
		return bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = 0;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
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
