class encapsulationEx
{
private String name;
private int id;

	public int getId()
	{
	return id;
	}
	public String getName()
	{
	return name;
	}
	public void setId(int uid)
	{
	id=uid;
	}
	public void setName(String user)
	{
	name=user;
	}

public static void main(String []args)
{
encapsulationEx en=new encapsulationEx();
en.setId(12345);
en.setName("Rahul");
System.out.println("Name: " + en.getName()); 
System.out.println("Id: " + en.getId()); 
}


}
