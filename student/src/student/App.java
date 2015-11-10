package student;

public class App {

	public static void main(String[] args) {


		Student student1 = new Student();
		Student student2 = new Student();
		
		
		student1.name = "Jane";
		student1.age = 24;
		student1.sex = "female";
		
		student2.name = "Carl";
		student2.age = 29;
		student2.sex = "male";

		
		System.out.println("student1's name: " + student1.getName());
		System.out.println("student1's age: " + student1.getAge());
		System.out.println("student1's sex: " + student1.getSex());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		System.out.println("student2's name: " + student2.getName());
		System.out.println("student2's age: " + student2.getAge());
		System.out.println("student2's sex: " + student2.getSex());

	}

}