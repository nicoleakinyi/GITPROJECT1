package intermediate;

public class CarWrongRunner {

	public static void main(String[] args) {
		CarWrong probox =new CarWrong("him", 21,"G-Wagon","black","SUV",5, 0,600,600 );
			System.out.println(probox.getMake());
			System.out.println(probox.getId());
			System.out.println(probox.getModel());
			System.out.println(probox.getColour());
			System.out.println(probox.getBodytype());
			System.out.println(probox.getPassengers());
			System.out.println(probox.getSpeed());
			System.out.println(probox.getTopspeed());
			System.out.println(probox.getEngineCC());

	}

}
