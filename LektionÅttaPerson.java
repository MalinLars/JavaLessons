
public class LektionÅttaPerson {
	private String name;
	private int age;
	private String gender;
	private String nationality;
	
	public LektionÅttaPerson(String name, int age, String gender, String nationality) {
		this.name = name;
		this.age = age;
		this.gender = gender; 
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationalit() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LektionÅttaPerson myPerson = new LektionÅttaPerson("Malin", 33, "Female", "Swedish");
		LektionÅttaPerson myPerson1 = new LektionÅttaPerson("Axel", 1, "Male", "Swedish");
		System.out.println(myPerson.name + " " +myPerson.age+ " " +myPerson.gender+ " " +myPerson.nationality);
		System.out.println(myPerson1.name + " " +myPerson1.age+ " " +myPerson1.gender+ " " +myPerson1.nationality);
	}

}
