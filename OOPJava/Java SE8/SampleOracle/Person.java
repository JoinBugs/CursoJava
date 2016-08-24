import java.util.Calendar;
import java.time.LocalDate;

public class Person
{
	public Person( String name, LocalDate birthday, 
		Sex gender, String emailAddress )
	{
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;		
	}

	public enum Sex{
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge()
	{
		return 0;
	}

	public LocalDate getBirthDay()
	{
		return birthday;
	}

	public static int compareByAge( Person a, Person b)
	{
		return a.birthday.compareTo( b.birthday );
	}
}