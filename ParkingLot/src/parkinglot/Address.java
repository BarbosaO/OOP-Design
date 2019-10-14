package parkinglot;

public class Address 
{
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	// Constructor
	public Address(String streetAddress, String city, String state, String zipCode,
			String country)
	{
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	
	// Getters & Setters
	public String getStreeAddress() 
	{
		return streetAddress;
	}
	
	public void setStreeAddress(String streeAddress) 
	{
		this.streetAddress = streeAddress;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String getZipCode() 
	{
		return zipCode;
	}
	
	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
}
