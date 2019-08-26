package intermediate;

public class Methodrunner {

	public static void main(String[] args) {
		Method me1 = new Method();
		int results = me1.calc(25,25);
		float results1 = me1.calc((float)25.2,25.8f);
		double results3 = me1.calc(23.45,34.56,45.67);
		System.out.print(results);
		System.out.print(results1);
		System.out.print(results3);

	}

}
