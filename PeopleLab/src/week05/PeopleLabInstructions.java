package week05;

public class PeopleLabInstructions {

	public static void main(String[] args) throws Exception {

		System.out.println("-------------------------");
		System.out.println("Week 05 Object Lab\n    Class Creation: ");

		System.out.println("-------------------------");
		/*
		 * 1. Person Class: Create a class called Person with fields firstName,
		 * lastName, and age. Make sure any age assigned must be valid (i.e. non
		 * negative and < 120)
		 */
		System.out.println("\nQuestion 1: Create Class & Instantiate\n ");

		/*
		 * Instantiate Person objects here
		 */

		try {
			Person person1 = new Person("Merms", "Plombo", 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Person person2 = new Person("Plimby", "Mermalade", -1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		/*
		 * 2. Declare 2 Instances of Person: Create 2 different instances of Person with
		 * different values for the fields.
		 */
		System.out.println("-------------------------");
		System.out.println("\nQuestion 2: Instantiate & call describe(): \n");

		/*
		 * Instantiate the object & call describe() here
		 */
		Person person3 = new Person("Olive", "Oyl", 25);
		person3.describe();
		Person person4 = new Person("Castor", "Oyl", 29);
		person4.describe();
		
		/*
		 * 3. Who is Older?
		 *
		 * Create and test a method that takes a two Persons and returns the firstName
		 * of the Person who is older.
		 */
		System.out.println("-------------------------");
		System.out.println("\nQuestion 3: Create & call a method  \n");
		System.out.println("The older person is:\n-------------------");

		/*
		 * Call to the new method here
		 */

		whoIsOlder(person3, person4);
		
		System.out.println("-------------------------");

	}

	/*
	 * Method -- Question 3:
	 */

	public static void whoIsOlder(Person a, Person b) {
		if (a.getAge() > b.getAge()) {
			System.out.println(a.getFirstName());
		} else {
			System.out.println(b.getFirstName());
		}
	}
	
}
