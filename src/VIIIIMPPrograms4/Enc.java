package VIIIIMPPrograms4;

public class Enc {
	
	private String name;
	private String city;
	
	public Enc(String name,String city)
	{
		this.name=name;
		this.city=city;
		
	}
	
	
	public void set_name(String name)
	{
		this.name=name;
	}
	private void set_city(String city)
	{
		this.city=city;
	}
	
	private String get_Name()
	{
		return name;
	}
	public String get_City()
	{
		return city;
	}

}
