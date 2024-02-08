package week05;

public class Person {

	String firstName;
	String lastName;
	int age;

	Person(String firstName, String lastName, int age) throws Exception {
		this.firstName = firstName;
		this.lastName = lastName;
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			throw new Exception(age + " in not a valid age.");
		}
		
	}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

	public void describe() {
		System.out.println(this.firstName + " " + this.lastName + ": " + this.age +" years old.");
	}
	
}
