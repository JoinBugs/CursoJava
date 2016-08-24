import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static Gender.MALE;
import static Gender.FEMALE;

public class Person
{
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Gender gender;

	public Person( String firstName, String lastName, 
		LocalDate dob, Gender gender)
	{
		this.firstName	= firstName;
		this.lastName	= lastName;
		this.dob		= dob;
		this.gender 	= gender;
	}

	public void setFirstName( String name)
}