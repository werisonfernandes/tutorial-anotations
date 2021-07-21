package br.com.werison.annotations;

import java.util.List;

@JsonSerializable
public class Person {

	@JsonElement
	private int id;
	@JsonElement
	private String firstName;
	@JsonElement
	private String lastName;
	@JsonElement(key = "personAge")
	private String age;
	private String address;
	@JsonElement
	private List<Integer> test;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName, String age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Init
	private void initNames() {
		this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
		this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Integer> getTest() {
		return test;
	}

	public void setTest(List<Integer> test) {
		this.test = test;
	}
}
