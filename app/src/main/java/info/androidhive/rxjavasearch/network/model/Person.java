package info.androidhive.rxjavasearch.network.model;

import com.google.gson.annotations.SerializedName;

public class Person {

	private int uid;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("sex_def_uid")
	private int sexDefUid;

	@SerializedName("date_of_birth")
	private String dateOfBirth;

	private String sex;
	private String age;

	public Person() {
	}

	public Person(int uid, String firstName, String lastName, int sexDefUid, String dateOfBirth, String sex) {
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sexDefUid = sexDefUid;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public int getSexDefUid() {
		return sexDefUid;
	}

	public void setSexDefUid(int sexDefUid) {
		this.sexDefUid = sexDefUid;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"uid=" + uid +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", sexDefUid=" + sexDefUid +
				", dateOfBirth=" + dateOfBirth +
				", sex='" + sex + '\'' +
				'}';
	}
}
