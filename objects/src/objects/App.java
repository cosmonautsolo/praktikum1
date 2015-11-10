package objects;

public class App {

	public static void main(String[] args) {


		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		
		banana1.color = "green";
		banana1.weight = 100;
		
		banana2.color = "yellow";
		banana2.weight = 150;

		
		System.out.println("banana1's color: " + banana1.getColor());
		System.out.println("banana1's weight: " + banana1.getWeight());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		System.out.println("banana2's color: " + banana2.getColor());
		System.out.println("banana2's weight: " + banana2.getWeight());

	}

}
