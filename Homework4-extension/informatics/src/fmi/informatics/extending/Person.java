package fmi.informatics.extending;

import fmi.informatics.interfaces.Active;
import fmi.informatics.interfaces.Adaptable;


public abstract class Person implements Active, Adaptable {
	
	private static String planet = "Earth";
	private static int variable = 0;

	public static int getVariable() {
		return variable;
	}
	
	public static String getPlanet() {
		return planet;
	}

	private String name = "Konstantin Rusev";
	private int egn;
	private char gender;
	private boolean isMale;
	private int age;
	private int height;
	private int weight;
	private String title;
	private int facNum;
	private String type;
	private String Speciality;
	public String university;

	public Person() {

	}

	public Person(String name, int egn) {
		this.name = name;
		this.egn = egn;
	}


	public Person(String name, boolean isMale, int age, int height, int weight) {
		this.name = name;
		this.isMale = isMale;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// създаваме допълнителен конструктор за студент
	public Person(String name, int egn, int age, int height, int weight,int facNum,String type) {
		this.name = name;
		this.egn = egn;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.facNum = facNum;
		this.type = type;

	}	// създаваме допълнителен конструктор за преподавател
	public Person(String name, int egn, int age, int height, int weight, String title,String type) {
		this.name = name;
		this.egn = egn;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.title = title;
		this.type = type;
	}

	public void walk() {
		variable++;
		System.out.println("The person is walking");
	}

	public void run() {
		variable--;
		System.out.println("The person is running");
	}

	public void move(int kmPerHour) {
		if (kmPerHour <= 5) {
			walk();
		} else {
			run();
		}
	}

	// Дефиниране на абстрактен метод -> тук няма имплементация, но класовете
	// наследници, които не са абстрактни класове са задължени да го имплементират
	protected abstract String getTypicalDrink();
	
	public void goBar() {
		System.out.println("The " + this.getClass().getSimpleName() + 
				" " + getName() + " drinking ");
		System.out.println(getTypicalDrink());
	}
	
	@Override
	public void getShower() {
		System.out.println("The person is getting shower");
	}
	
	// Getters and setters
	public String getName() {
		if (this.name == null) {
			this.name = "Default";
		}
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEgn() {
		return egn;
	}

	public void setEgn(int egn) {
		this.egn = egn;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFacNum() {
		return facNum;
	}

	public void setFacNum(int facNum) {
		this.facNum = facNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		this.Speciality = speciality;
	}
	public String getUniversity() {
		return university;
	}
	
}