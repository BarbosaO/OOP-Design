package parkinglot;

public class Person 
{
	private String name;
	private Address address;
	private String email;
	private String phone;
	
	public Person(String aName, Address anAddress, String anEmail, String aPhone)
	{
		name  = aName;
		address = anAddress;
		email = anEmail;
		phone = aPhone;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String aName) 
	{
		name = aName;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address anAddress) 
	{

		address = anAddress;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String anEmail) 
	{
		email = anEmail;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String aPhone) 
	{
		phone = aPhone;
	}
	
	public String toString()
	{
		return "This is " + name + "."; 
	}
}
