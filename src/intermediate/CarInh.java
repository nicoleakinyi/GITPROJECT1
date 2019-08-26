package intermediate;

public class CarInh extends Transporter {
	private int tires;
	private String vehicletype; 

	public CarInh(String make,String model,String colour,int tires, String vehicletype,int id,String bodytype,int passengers,int speed,int topspeed,int engineCC) {
		this.tires = tires;
		this.vehicletype = vehicletype;
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
	
}
