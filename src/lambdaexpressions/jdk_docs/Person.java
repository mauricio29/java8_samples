package lambdaexpressions.jdk_docs;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		Year nowYear = java.time.Year.from(java.time.LocalDate.now());
		Year birthYear = java.time.Year.from(birthday);
		return nowYear.getValue() - birthYear.getValue(); // TODO: fix, this is not precise
	}

	public void printPerson() {
		System.out.println(name);
	}

	public Sex getGender() {
		return this.gender;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public static List<Person> createRoster() {

		List<Person> result = new ArrayList<Person>();

		Person p = new Person();
		p.name = "mujer 25";
		p.birthday = java.time.LocalDate.now().minusYears(25); // tiene 25 años
		p.gender = Sex.FEMALE;
		p.emailAddress = "mujer@de25.com";
		result.add(p);

		p = new Person();
		p.name = "hombre 23";
		p.birthday = java.time.LocalDate.now().minusYears(23); // tiene 23
		p.gender = Sex.MALE;
		p.emailAddress = "hombre@de23.com";
		result.add(p);

		return result;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}